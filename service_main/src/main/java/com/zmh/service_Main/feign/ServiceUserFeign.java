package com.zmh.service_Main.feign;

import com.zmh.service_Main.config.FeignConfig;
import com.zmh.service_Main.entry.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "service-user",configuration = FeignConfig.class)
public interface ServiceUserFeign {

    @PostMapping("/user/insert")
    @Transactional
    public String insertUser(@RequestBody String name);


    @GetMapping("/user/select")
    public List<User> tolist();

}
