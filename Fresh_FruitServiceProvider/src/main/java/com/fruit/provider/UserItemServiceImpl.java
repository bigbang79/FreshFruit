package com.fruit.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruit.common.util.RandomUtils;
import com.fruit.mapper.fruit.UserItemMapper;
import com.fruit.domain.fruit.UserItem;
import com.fruit.service.UserItemService;

@Service
public class UserItemServiceImpl implements UserItemService {
    
    @Autowired
    private UserItemMapper userItemMapper;

    @Override
    public boolean insertUserItem(UserItem userItem) {
        try {
            // 随机ID
            userItem.setUserItemId(RandomUtils.getId());
            return userItemMapper.insertUserItem(userItem) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUserItem(UserItem userItem) {
        try {
            return userItemMapper.updateUserItem(userItem) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int countUserItemByCondition(UserItem userItem) {
        return userItemMapper.countUserItemByCondition(userItem);
    }

    @Override
    public List<UserItem> listUserItemByUserId(UserItem userItem) {
        List<UserItem> list = userItemMapper.listUserItemByUserId(userItem);
        return null != list && list.size() > 0 ? list : null;
    }

    @Override
    public int countItemTotalStar(Integer itemId) {
        return userItemMapper.countItemTotalStar(itemId);
    }

    @Override
    public boolean updateUserItemState(UserItem userItem) {
        try {
            return userItemMapper.updateUserItemState(userItem) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
