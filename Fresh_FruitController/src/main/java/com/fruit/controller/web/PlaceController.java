package com.fruit.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruit.common.vo.R;
import com.fruit.domain.fruit.Place;
import com.fruit.service.PlaceService;

@Controller
public class PlaceController {

    @Autowired
    private PlaceService placeService;
    
    /**
     * 新增产地
     * @param place
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 22:17
     */
    @RequestMapping("insertPlace.do")
    @ResponseBody
    public R<Place> insertPlace(Place place) {
        R<Place> result = new R<Place>();
        // 修改成功返回true，失败返回false
        boolean flag = placeService.insertPlace(place);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "新增产地成功" : "新增产地失败");
        return result;
    }
    
    /**
     * 修改产地
     * @param place
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 22:25
     */
    @RequestMapping("updatePlace.do")
    @ResponseBody
    public R<Place> updatePlace(Place place) {
        R<Place> result = new R<Place>();
        // 修改成功返回true，失败返回false
        boolean flag = placeService.updatePlace(place);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改产地成功" : "修改产地失败");
        return result;
    }
    
    /**
     * 修改商品产地state
     * @param place
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:10
     */
    @RequestMapping("updatePlaceState.do")
    @ResponseBody
    public R<Place> updatePlaceState(Place place) {
        R<Place> result = new R<Place>();
        // 修改成功返回true，失败返回false
        boolean flag = placeService.updatePlaceState(place);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改产地状态成功" : "修改产地状态失败");
        return result;
    }
    
    /**
     * 按条件查找产地
     * @param place
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:48
     */
    @RequestMapping("listPlace.do")
    @ResponseBody
    public R<Place> listPlace(Place place) {
        R<Place> result = new R<Place>();
        // 成功返回list，失败返回null
        List<Place> list = placeService.listPlace(place);
        result.setCode(list.size() > 0 ? 1 : 0);
        result.setMsg(list.size() > 0 ? "查找产地成功" : "查找产地失败/还没有该产地");
        result.setData(list);
        return result;
    }
}
