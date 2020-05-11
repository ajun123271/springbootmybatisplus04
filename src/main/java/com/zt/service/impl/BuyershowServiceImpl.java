package com.zt.service.impl;

import com.zt.entity.Buyershow;
import com.zt.entity.Comment;
import com.zt.mapper.BuyershowMapper;
import com.zt.service.BuyershowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xyq
 * @create 2020-05-08 19:28
 */
@Service
public class BuyershowServiceImpl implements BuyershowService {

    @Autowired
    private BuyershowMapper buyershowMapper;

    @Override
    public List<Buyershow> getAllShow() {
        return buyershowMapper.getAllShow();
    }

    @Override
    public Buyershow getOneShow(int showid) {
        return buyershowMapper.getOneShow(showid);
    }

    @Override
    public List<Comment> getAllCommentByshow(int showid) {
        return buyershowMapper.getAllCommentByshow(showid);
    }

    @Override
    public int addComment(Comment comment) {
        return buyershowMapper.addComment(comment);
    }
}