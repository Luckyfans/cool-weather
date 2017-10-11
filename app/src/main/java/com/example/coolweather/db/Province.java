package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Danni on 2017/7/12.
 */

public class Province extends DataSupport {
    private int id,provinceCode;
    private String provinceName;

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }
}
