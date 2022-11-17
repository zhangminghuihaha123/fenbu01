package com.zmh.service_Main.feign;

import com.zmh.service_Main.config.FeignConfig;
import com.zmh.service_Main.entry.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "service-goods",configuration = FeignConfig.class)
public interface ServiceGoodsFeign {

    @PostMapping("/good/insert")
    @Transactional
    public String toInsertGoods(@RequestBody Goods goods);


    @GetMapping("/good/get")
    public List<Goods> get();
}
