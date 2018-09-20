package com.fruit.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruit.mapper.fruit.RepertoryMapper;
import com.fruit.domain.fruit.Repertory;
import com.fruit.service.RepertoryService;

@Service
public class RepertoryServiceImpl implements RepertoryService {
    
    @Autowired
    private RepertoryMapper repertoryMapper;

    @Override
    public boolean updateRepertoryItemTotalNum(Repertory repertory) {
        try {
            return repertoryMapper.updateRepertoryItemTotalNum(repertory) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateRepertoryItemSurplusNum(Integer itemId) {
        try {
            return repertoryMapper.updateRepertoryItemSurplusNum(itemId) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Repertory getRepertory(Integer itemId) {
        Repertory repertory = repertoryMapper.getRepertory(itemId);
        return null != repertory ? repertory :null;
    }

    @Override
    public boolean updateRepertoryState(Repertory repertory) {
        try {
            return repertoryMapper.updateRepertoryState(repertory) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
