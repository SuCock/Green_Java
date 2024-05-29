import React, { useMemo, useState } from 'react';

const MapNowLaction = () => {
    const [location, setLocation] = useState({
        latitude: null,
        longitude: null,
    });
    
    useMemo(() => {
        const watcher = navigator.geolocation.watchPosition((position) => {
            setLocation({
                latitude: position.coords.latitude,
                longitude: position.coords.longitude,
            });
        });
        return () => navigator.geolocation.clearWatch(watcher);
    }, [location]);

    return (
        <>
            <div id='map'>
                <p>latitude</p>
                <p>longitude</p>
            </div>
        </>
    )
}

export default NowLaction;