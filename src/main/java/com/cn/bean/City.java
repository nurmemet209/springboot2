package com.cn.bean;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by Administrator on 1/21/2017.
 */
public class City {

    private String name;
    @JSONField(serialize=false)
    private String cityCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }


}
