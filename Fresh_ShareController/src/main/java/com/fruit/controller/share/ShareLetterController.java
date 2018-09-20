package com.fruit.controller.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareLetter;
import com.fruit.service.share.ShareLetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareLetterController {
    @Autowired
    private ShareLetterService service;
    @PostMapping("sharelettersave.do")
    public R add(ShareLetter shareLetter){
        return service.save(shareLetter);
    }
    @GetMapping("shareletterdel.do")
    public R delete(int id){
        return service.delete(id);
    }
    @GetMapping("shareletterpage.do")
    public R queryByUid(int uid,int uuid){
        return service.qureyByUid(uid,uuid);
    }
}
