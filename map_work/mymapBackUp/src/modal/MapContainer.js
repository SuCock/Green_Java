import React, { useEffect } from 'react';

const { kakao } = window;

const MapContainer = () => {
    useEffect(() => {
        const markerdata = [
            {
                id: 0,
                address: '신정로 225-12',
                title: '교촌 치킨 접선 모임',
            },
            {
                id: 1,
                address: '오목로 337-10',
                title: '삼겹살 접선 모임',
            },
            {
                id: 2,
                address: '오목로 245',
                title: '라멘 접선 모임',
            },
            {
                id: 3,
                address: '목동서로 256',
                title: '곱창 모임',
            },
            {
                id: 4,
                address: '신정로 213',
                title: '곱창 모임',
            },
        ];

        const nowData = { address: '신정로 225-12' };

        const container = document.getElementById('myMap');
        const options = {
            center: new kakao.maps.LatLng(35.12, 129.1),
            level: 8,
        };

        // 지도를 생성합니다.
        const map = new kakao.maps.Map(container, options);
        // 주소-좌표 변환 객체를 생성합니다.
        const geocoder = new kakao.maps.services.Geocoder();

        // var clusterer = new kakao.maps.MarkerClusterer({
        //   map: map, // 마커들을 클러스터로 관리하고 표시할 지도 객체
        //   averageCenter: true, // 클러스터에 포함된 마커들의 평균 위치를 클러스터 마커 위치로 설정
        //   minLevel: 10, // 클러스터 할 최소 지도 레벨
        // });

        const totalCoordinate = [];

        // 주소로 좌표를 검색합니다..
        markerdata.forEach((el) => {
            geocoder.addressSearch(el.address, function (result, status) {
                // 정상적으로 검색이 완료됐으면
                if (status === kakao.maps.services.Status.OK) {
                    const coord = new kakao.maps.LatLng(result[0].y, result[0].x);
                    // 결과값으로 받은 위치를 마커로 표시합니다
                    const marker = new kakao.maps.Marker({
                        map: map,
                        position: coord,
                    });

                    totalCoordinate.push(marker);

                    // 인포윈도우로 장소에 대한 설명을 표시합니다
                    const infowindow = new kakao.maps.InfoWindow({ zIndex: 1 });
                    kakao.maps.event.addListener(marker, 'click', function () {
                        const content =
                            `<div style="width:150px;color:red;text-align:center;padding:6px 0;">` +
                            el.address +
                            `</div>`;

                        if (infowindow.getMap()) {
                            infowindow.close();
                        } else {
                            infowindow.open(map, marker);
                            infowindow.setContent(content);
                        }
                    });
                }
            });
        });
        // clusterer.addMarker(aaa);
        geocoder.addressSearch(nowData.address, function (result, status) {
            // 정상적으로 검색이 완료됐으면
            if (status === kakao.maps.services.Status.OK) {
                const coords = new kakao.maps.LatLng(result[0].y, result[0].x);
                console.log('현재위치', coords);
                // // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
                map.setCenter(coords);

                var circle = new kakao.maps.Circle({
                    map: map,
                    center: coords,
                    radius: 1000, // m단위
                    strokeWeight: 2,
                    strokeColor: '#FF00FF',
                    strokeOpacity: 0.8,
                    strokeStyle: 'dashed',
                    fillColor: '#00EEEE',
                    fillOpacity: 0.5,
                });

                var center = circle.getPosition();
                var radius = circle.getRadius();
                var line = new kakao.maps.Polyline();

                console.log(totalCoordinate);

                totalCoordinate.forEach(function (marker) {
                    console.log('마커마커', marker.n);
                    // 마커의 위치와 원의 중심을 경로로 하는 폴리라인 설정
                    console.log('센터', center);
                    console.log('마커마커', marker);
                    var path = [marker.n, center];
                    line.setPath(path);
                    console.log('라인', path);
                    // 마커와 원의 중심 사이의 거리

                    var drawLine = new kakao.maps.Polyline({
                        map: map, // 선을 표시할 지도입니다
                        path: path,
                        strokeWeight: 3, // 선의 두께입니다
                        strokeColor: '#db4040', // 선의 색깔입니다
                        strokeOpacity: 1, // 선의 불투명도입니다 0에서 1 사이값이며 0에 가까울수록 투명합니다
                        strokeStyle: 'solid', // 선의 스타일입니다
                    });

                    var dist = line.getLength();
                    console.log('dist', dist);

                    // 이 거리가 원의 반지름보다 작거나 같다면
                    if (dist < radius) {
                        // 해당 marker는 원 안에 있는 것
                        marker.setMap(map);
                    } else {
                        marker.setMap(null);
                    }
                });
            }
        });
    }, []);

    return (
        <div
            id='myMap'
            style={{
                width: '800px',
                height: '800px',
            }}
        ></div>
    );
};

export default MapContainer;