import React, { useEffect, useMemo, useState } from "react";

const { kakao } = window;

//불러오는 부모페이지에서 props로 location={pageDetail}전달
export const MapComponent = ({ initlocation }) => {

    initlocation = initlocation || { location_x: 0, location_y: 0 }; //초기값 설정
    const [location, setLocation] = useState(initlocation); //초기값 설정

    const drawMap = () => {
        var container = document.getElementById("map"); //지도를 담을 영역의 DOM 레퍼런스
        var options = {
            center: new kakao.maps.LatLng(
                location.location_x,
                location.location_y
            ), //지도의 중심좌표
            level: 3,
        };

        // 마커 이미지의 이미지 주소입니다
        var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";
        // 마커 이미지의 이미지 크기 입니다
        var imageSize = new kakao.maps.Size(24, 35);

        // 마커 이미지를 생성합니다    
        var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize);
        var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
        var markerPosition = new kakao.maps.LatLng(
            location.location_x,
            location.location_y
        );
        var marker;

        // 지도에 표시할 원을 생성합니다
        var circle = new kakao.maps.Circle({
            center: new kakao.maps.LatLng(
                location.location_x,
                location.location_y
            ), // 원의 중심좌표
            radius: 500, // 미터 단위의 원의 반지름입니다 
            strokeWeight: 5, // 선의 두께입니다 
            strokeColor: '#75B8FA', // 선의 색깔입니다
            strokeOpacity: 1, // 선의 불투명도 입니다 1에서 0 사이의 값이며 0에 가까울수록 투명합니다
            strokeStyle: 'dashed', // 선의 스타일 입니다
        });

        // 마커를 표시할 위치와 title 객체 배열입니다 
        var positions = [
            {
                title: 'aa',
                latlng: new kakao.maps.LatLng(35.87481499948335, 128.58376288336981)
            },
            {
                title: 'bb',
                latlng: new kakao.maps.LatLng(35.87398882972803, 128.5828606752566)
            },
            {
                title: 'cc',
                latlng: new kakao.maps.LatLng(35.874207843545015, 128.584702992049)
            },
            {
                title: 'dd',
                latlng: new kakao.maps.LatLng(35.873024966713274, 128.58351688341892)
            },
            // 반경밖으로 표시
            {
                title: 'ee',
                latlng: new kakao.maps.LatLng(35.87442884399841, 128.5952369272623)
            },
            {
                title: 'ff',
                latlng: new kakao.maps.LatLng(35.87383708150048, 128.5956900842964)
            },
            {
                title: 'gg',
                latlng: new kakao.maps.LatLng(35.87333963414313, 128.59514865566558)
            },
            {
                title: 'hh',
                latlng: new kakao.maps.LatLng( 35.872556730904954, 128.59506652797722)
            },
            {
                title: 'ii',
                latlng: new kakao.maps.LatLng(35.87284625086417, 128.59362192187334)
            },
            {
                title: 'jj',
                latlng: new kakao.maps.LatLng(35.87345103103126, 128.5935454607006)
            },

        ];
        
            for (var i = 0; i < positions.length; i ++) {
            
                // 마커를 생성합니다
                    marker = new kakao.maps.Marker({
                    map: map, // 마커를 표시할 지도
                    position: positions[i].latlng, // 마커를 표시할 위치
                });
            }
        

        //해당 위치 마커 표시
        marker = new kakao.maps.Marker({
            position: markerPosition, // 마커를 표시할 위치
            image: markerImage // 마커 이미지 
        });

        // 지도에 마커 표시
        marker.setMap(map);

        // 지도에 원을 표시합니다 
        circle.setMap(map);

        // 일반 지도와 스카이뷰로 지도 타입을 전환할 수 있는 지도타입 컨트롤을 생성합니다
        var mapTypeControl = new kakao.maps.MapTypeControl();

        // 지도에 컨트롤을 추가해야 지도위에 표시됩니다
        // kakao.maps.ControlPosition은 컨트롤이 표시될 위치를 정의하는데 TOPRIGHT는 오른쪽 위를 의미합니다
        map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT);

        // 지도 확대 축소를 제어할 수 있는  줌 컨트롤을 생성합니다
        var zoomControl = new kakao.maps.ZoomControl();
        map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);

    }

    useEffect(drawMap, [location]);

    // geoLoaction을 이용해서 현재 위치찾기
    const showNowPosition = () => {
        navigator.geolocation.getCurrentPosition((position) => {
            setLocation({
                location_x: position.coords.latitude,
                location_y: position.coords.longitude
            })
        });
    }


    useMemo(() => {
        return showNowPosition();
    }, []);

    return (
        <div>
            <h1>위도 : {location.location_x}</h1>
            <h1>경도 : {location.location_y}</h1>
            <div id="map"></div>
        </div>
    );
}
export default MapComponent;