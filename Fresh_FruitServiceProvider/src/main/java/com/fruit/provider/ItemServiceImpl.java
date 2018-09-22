package com.fruit.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fruit.common.jedis.JedisClient;
import com.fruit.common.util.JsonUtils;
import com.fruit.common.util.RandomUtils;
import com.fruit.mapper.fruit.ItemImageMapper;
import com.fruit.mapper.fruit.ItemInfoMapper;
import com.fruit.mapper.fruit.ItemMapper;
import com.fruit.mapper.fruit.RepertoryMapper;
import com.fruit.domain.fruit.Item;
import com.fruit.domain.fruit.ItemImage;
import com.fruit.domain.fruit.ItemInfo;
import com.fruit.domain.fruit.Repertory;
import com.fruit.service.ItemService;

@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService{
    
    @Autowired
    private ItemMapper itemMapper;
    
    @Autowired
    private ItemImageMapper itemImageMapper;
    
    @Autowired
    private ItemInfoMapper itemInfoMapper;
    
    @Autowired
    private RepertoryMapper repertoryMapper;

    @Autowired
    private JedisClient client;
    
    @Override
    @Transactional
    public boolean insertItem(Item item, Repertory repertory) {
        try {
            // 新增商品的时候需要同时新增一条库存表
            // 随机ID值
            item.setItemId(RandomUtils.getId());
            // 随机ID
            repertory.setRepertoryId(RandomUtils.getId());
            return itemMapper.insertItem(item) > 0 && repertoryMapper.insertRepertory(repertory) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateItemRepertoryAndItemBarcode(Item item) {
        try {
            return itemMapper.updateItemRepertoryAndItemBarcode(item) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean insertItemImage(ItemImage itemImage) {
        try {
            // 随机数ID
            itemImage.setItemImageId(RandomUtils.getId());
            return itemImageMapper.insertItemImage(itemImage) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateItemImage(ItemImage itemImage) {
        try {
            return itemImageMapper.updateItemImage(itemImage) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean insertItemInfo(ItemInfo itemInfo) {
        try {
            // 随机ID
            itemInfo.setItemInfoId(RandomUtils.getId());
            return itemInfoMapper.insertItemInfo(itemInfo) > 0 ? true:false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateItemInfo(ItemInfo itemInfo) {
        try {
            return itemInfoMapper.updateItemInfo(itemInfo) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateItemState(Item item) {
        try {
            return itemMapper.updateItemState(item) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Item> listItemByPlcaeId(Integer placeId) {
        String jsonStr = client.get("placeId:" + placeId);
        // 添加缓存不能影响正常的业务逻辑
        try {
            // 判断 是否redis中有数据 如果有 直接从redis中获取数据 返回
            if (null == jsonStr || "".equals(jsonStr)) {
                // 将数据写入redis中
                System.out.println("这里还没有缓存");
                List<Item> list = itemMapper.listItemByPlcaeId(placeId);
                client.set("placeId:" + placeId, JsonUtils.objectToJson(list));
                System.out.println("写入缓存中了");
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("这里有缓存了，直接从这拿");
        List<Item> list = JsonUtils.jsonToList(jsonStr, Item.class);
        return list.size() > 0 ? list : null;
    }

    @Override
    public List<Item> listItemByCategoryId(Integer categoryId) {
        String jsonStr = client.get("categoryId:" + categoryId);
        // 添加缓存不能影响正常的业务逻辑
        try {
            // 判断 是否redis中有数据 如果有 直接从redis中获取数据 返回
            if (null == jsonStr || "".equals(jsonStr)) {
                // 将数据写入redis中
                System.out.println("这里还没有缓存");
                List<Item> list = itemMapper.listItemByCategoryId(categoryId);
                client.set("categoryId:" + categoryId, JsonUtils.objectToJson(list));
                System.out.println("写入缓存中了");
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("这里有缓存了，直接从这拿");
        List<Item> list = JsonUtils.jsonToList(jsonStr, Item.class);
        return list.size() > 0 ? list : null;
    }

    @Override
    public List<Item> listItemByBrandId(Integer brandId) {
        String jsonStr = client.get("brandId:" + brandId);
        // 添加缓存不能影响正常的业务逻辑
        try {
            // 判断 是否redis中有数据 如果有 直接从redis中获取数据 返回
            if (null == jsonStr || "".equals(jsonStr)) {
                // 将数据写入redis中
                System.out.println("这里还没有缓存");
                List<Item> list = itemMapper.listItemByBrandId(brandId);
                client.set("brandId:" + brandId, JsonUtils.objectToJson(list));
                System.out.println("写入缓存中了");
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("这里有缓存了，直接从这拿");
        List<Item> list = JsonUtils.jsonToList(jsonStr, Item.class);
        return list.size() > 0 ? list : null;
    }

    @Override
    public boolean updateItemInfoState(ItemInfo itemInfo) {
        try {
            return itemInfoMapper.updateItemInfoState(itemInfo) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateItemImageState(ItemImage itemImage) {
        try {
            return itemImageMapper.updateItemImageState(itemImage) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Item> listItemByItemNameLike(String itemName) {
        List<Item> list = itemMapper.listItemByItemNameLike(itemName);
        return null != list && list.size() > 0 ? list :null;
    }

}
