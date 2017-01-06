package com.bean;

import java.util.List;


public class Page<T>{
	//当前页
    private int page;
    //页面容量
    private int pageSize;
    private T entity;


    public int getPage() {
        return page;
    }

    public Page setPage(int page) {
        this.page = page;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Page setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getOffset() {
    	//偏移量，从第几条数据开始
        return (page - 1) * pageSize;
    }

    public T getEntity() {
        return entity;
    }

    public Page setEntity(T entity) {
        this.entity = entity;
        return this;
    }
}
