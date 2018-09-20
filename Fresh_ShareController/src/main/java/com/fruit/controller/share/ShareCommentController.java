package com.fruit.controller.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareComment;
import com.fruit.service.share.ShareCommentServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareCommentController {
    @Autowired
    private ShareCommentServcie servcie;
    @PostMapping("sharecommentsave.do")
    public R add(ShareComment shareComment){
        return servcie.save(shareComment);
    }
    @GetMapping("sharecommentdel.do")
    public R delete(int id){
        return servcie.delete(id);
    }
    @GetMapping("sharecommentuid.do")
    public R queryByUid(int uid){
        return servcie.queryByUid(uid);
    }
    @GetMapping("sharecommentsid.do")
    public R queryBySid(int sid){
        return servcie.queryBySid(sid);
    }
}
