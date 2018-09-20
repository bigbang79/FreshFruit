package com.fruit.controller.share;

import com.fruit.common.result.R;
import com.fruit.service.share.ShareImagesService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShareImagesController {
    @Autowired
    private ShareImagesService service;
    @GetMapping("shareimageslistsid.do")
    public R queryBySid(int sid){
        return service.queryBySid(sid);
    }
    @GetMapping("shareimagesdelsid.do")
    public R delBySid(int sid){
        return service.delete(sid);
    }
    @PostMapping("shareimagessave.do")
    public R add(List<String > list,int sid){
        return service.save(list,sid);
    }

}
