package com.zmh.service_Main.controller.Good;

import cn.hutool.core.date.DateUtil;
import com.zmh.service_Main.entry.Goods;
import com.zmh.service_Main.feign.ServiceGoodsFeign;
import com.zmh.service_Main.feign.ServiceUserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class GoodsController {

    @Autowired
     private ServiceGoodsFeign serviceGoodsFeign;

    @Autowired
    private ServiceUserFeign serviceUserFeign;

    @GetMapping("/insert")
    public String inGoods(@RequestParam String user,@RequestParam String good){
        if(!serviceUserFeign.panduanUser(user).equals(0)) {
            Goods goods=new Goods();
            goods.setUser(user).setGood(good).setCreateTime(DateUtil.today());
            serviceGoodsFeign.toInsertGoods(goods);
            return "插入成功!";
        }else {
            return "请查看是否有此人!";
        }
    }

    @GetMapping("/getgood")
    public List<Goods> getlist(){
        return serviceGoodsFeign.get();
    }
}
