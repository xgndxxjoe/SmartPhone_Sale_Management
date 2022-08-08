/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.model;

/**
 *
 * @author phamn
 */
public class ChiNhanh {
    private int maCN;
    private String tenCN;
    private String diaChi;
    private int sdt;

    public ChiNhanh() {
    }

    public ChiNhanh(int maCN, String tenCN, String diaChi, int sdt) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    
}
