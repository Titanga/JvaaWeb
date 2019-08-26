package com.obcy.bean;

import java.util.List;

/**
 * @auther obcy
 * @date 2019/8/25 0025 - 16:04
 */
public class Page<T> {
    /**
    *总记录数
    */
    private int totalCount ;
    /**
    *总页码
    */
    private int totaPage ;
    /**
     *每页的数据
     */
    private List<T> list ;
    /**
    *当前页码
    */
    private int currentPage ;
    /**
    *每页显示的记录数
    */
    private int rows ;

    @Override
    public String toString() {
        return "Page{" +
                "totalCount=" + totalCount +
                ", totaPage=" + totaPage +
                ", list=" + list +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                '}';
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotaPage() {
        return totaPage;
    }

    public void setTotaPage(int totaPage) {
        this.totaPage = totaPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Page() {
    }

    public Page(int totalCount, int totaPage, List<T> list, int currentPage, int rows) {
        this.totalCount = totalCount;
        this.totaPage = totaPage;
        this.list = list;
        this.currentPage = currentPage;
        this.rows = rows;
    }
}
