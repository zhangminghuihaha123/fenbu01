package com.zmh.service_goods.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zmh.service_goods.entry.Goods;
import com.zmh.service_goods.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/good")
public class ServiceGoodsController {

    @Autowired
    private GoodsMapper goodsMapper;

    @PostMapping("/insert")
    @Transactional
    public String toInsertGoods(@RequestBody Goods goods){
        try{
            goodsMapper.insert(goods);
            return "ok";
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    @GetMapping("/get")
    public List<Goods> get(){
        QueryWrapper wrapper=new QueryWrapper();
        return goodsMapper.selectList(wrapper);
    }
}
