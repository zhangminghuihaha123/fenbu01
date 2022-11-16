package com.zmh.service_Main.controller.User;

import com.zmh.service_Main.entry.User;
import com.zmh.service_Main.feign.ServiceUserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class UserController {

      @Autowired
      private ServiceUserFeign serviceUserFeign;

      @GetMapping("/insert/{name}")
      public String toInsertUser(@PathVariable String name){
          if(serviceUserFeign.insertUser(name).equals("success")){
              return "ok";
          }else {
              return "error";
          }
      }

      @GetMapping("/select")
      public List<User> toSelect(){
              List<User> tolist = serviceUserFeign.tolist();
              return tolist;
      }
}
