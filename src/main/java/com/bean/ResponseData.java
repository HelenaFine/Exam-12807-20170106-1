package com.bean;

import java.util.List;


public class ResponseData<T>  {
	//总条数
    private int total;
    //数据列表
    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public ResponseData<T> setTotal(int total) {
        this.total = total;
        return this;
    }

    public List<T> getRows() {
        return rows;
    }

    public ResponseData<T> setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }
}
