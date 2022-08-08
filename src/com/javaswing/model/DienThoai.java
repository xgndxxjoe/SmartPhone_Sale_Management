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
public class DienThoai {
    private int maDT;
    private String tenDT;
    private String heDieuHanh;
    private String ram;
    private String boNho;
    private float gia;
    private int soLuong;

    public DienThoai() {
    }
    
    public DienThoai(int maDT, String tenDT, String heDieuHanh, String ram, String boNho, float gia, int soLuong) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.heDieuHanh = heDieuHanh;
        this.ram = ram;
        this.boNho = boNho;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getMaDT() {
        return maDT;
    }

    public void setMaDT(int maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
