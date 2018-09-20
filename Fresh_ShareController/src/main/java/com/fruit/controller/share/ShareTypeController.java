package com.fruit.controller.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareType;
import com.fruit.service.share.ShareTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareTypeController {
    @Autowired
    private ShareTypeService service;
    @PostMapping("sharetypesave.do")
    public R add(ShareType shareType){
        return service.save(shareType);
    }
    @GetMapping("sharetypedel.do")
    public R delete(int id){
        return service.delete(id);
    }
    @GetMapping("sharetypeall.do")
    public R queryByPage(){
        return service.queryAll();
    }
}
