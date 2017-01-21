package com.cn.controller;

import com.cn.bean.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 1/18/2017.
 */
@Controller
public class MyController {

    @GetMapping("/index")
    public String index(Map<String, Object> model) {
        model.put("msg", "welocme");
        return "index";
    }

    @GetMapping("/getCity")
    @ResponseBody
    public City getCity() {
        City city = new City();
        city.setName("上海");
        city.setCityCode("0212");
        return city;
    }
}
