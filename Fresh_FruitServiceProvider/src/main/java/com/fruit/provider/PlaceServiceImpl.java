package com.fruit.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruit.common.util.RandomUtils;
import com.fruit.mapper.fruit.PlaceMapper;
import com.fruit.domain.fruit.Place;
import com.fruit.service.PlaceService;

@Service
public class PlaceServiceImpl implements PlaceService {
    
    @Autowired
    private PlaceMapper placeMapper;

    @Override
    public boolean insertPlace(Place place) {
        try {
            // 设置随机Id
            place.setPlaceId(RandomUtils.getId());
            return placeMapper.insertPlace(place) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updatePlace(Place place) {
        try {
            return placeMapper.updatePlace(place) > 0 ? true : false;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }

    @Override
    public boolean updatePlaceState(Place place) {
        try {
            return placeMapper.updatePlaceState(place) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Place> listPlace(Place place) {
        List<Place> list = placeMapper.listPlace(place);
        return list;
    }

}
