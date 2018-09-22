package com.fruit.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruit.common.vo.R;
import com.fruit.domain.fruit.Repertory;
import com.fruit.service.RepertoryService;

@Controller
public class RepertoryController {
    
    @Autowired
    private RepertoryService repertoryService;
    
    /**
     * 修改库存总量n
     * @param repertory
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 15:01
     */
    @RequestMapping("updateRepertoryItemTotalNum.do")
    @ResponseBody
    public R<Repertory> updateRepertoryItemTotalNum(Repertory repertory) {
        R<Repertory> result = new R<Repertory>();
        // 如果属性为空，直接修改失败
        if (null == repertory.getItemId() || null == repertory.getItemTotalNum()) {
            result.setCode(0);
            result.setMsg("修改库存总量失败");
            return result;
        }
        // 调用服务层方法，修改商品库存
        boolean flag = repertoryService.updateRepertoryItemTotalNum(repertory);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改库存总量成功" : "修改库存总量失败");
        return result;
    }
    
    /**
     * 修改商品剩余库存数量（在商品出库时-1，商品退货入库时+1）
     * 现在只有-1，之后进一步细分
     * @param num
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 15:25
     */
    @RequestMapping("updateRepertoryItemSurplusNum.do")
    @ResponseBody
    public R<Repertory> updateRepertoryItemSurplusNum(Integer itemId) {
        R<Repertory> result = new R<Repertory>();
        // 如果属性为空，直接修改失败
        if (null == itemId) {
            result.setCode(0);
            result.setMsg("修改库存剩余数量失败");
            return result;
        }
        // 调用服务层方法，修改商品库存
        boolean flag = repertoryService.updateRepertoryItemSurplusNum(itemId);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改库存剩余数量成功" : "修改库存剩余数量失败");
        return result;
    }
    
    /**
     * 查询商品库存
     * @param itemId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 15:54
     */
    @RequestMapping("getRepertoryByItemId.do")
    @ResponseBody
    public R<Repertory> getRepertory(Integer itemId) {
        R<Repertory> result = new R<Repertory>();
        // 如果属性为空，直接修改失败
        if (null == itemId) {
            result.setCode(0);
            result.setMsg("查询库存失败");
            return result;
        }
        // 调用服务层方法，修改商品库存
        Repertory repertory = repertoryService.getRepertory(itemId);
        result.setCode(null != repertory ? 1 : 0);
        result.setMsg(null != repertory ? "查询库存成功" : "查询库存失败");
        return result;
    }
    
    /**
     * 修改库存表状态
     * @param repertory
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:36
     */
    @RequestMapping("updateRepertoryState.do")
    @ResponseBody
    public R<Repertory> updateRepertoryState(Repertory repertory) {
        R<Repertory> result = new R<Repertory>();
        // 如果属性为空，直接修改失败
        if (null == repertory.getRepertoryId()) {
            result.setCode(0);
            result.setMsg("修改库存state失败");
            return result;
        }
        // 调用服务层方法，修改商品库存
        boolean flage = repertoryService.updateRepertoryState(repertory);
        result.setCode(flage ? 1 : 0);
        result.setMsg(flage ? "修改库存state成功" : "修改库存state失败");
        return result;
    }
}
