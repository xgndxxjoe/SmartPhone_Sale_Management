/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.model;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author phamn
 */
public class NhanVien {
    private int maNV;
    private String hoNV;
    private String tenNV;
    private int sdt;
    private Date ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private float luong;
    private String username;
    private String password;
    private int maCN;

    public NhanVien() {
    }

    public NhanVien(int maNV, String hoNV, String tenNV, int sdt, Date ngaySinh,
            String gioiTinh, String diaChi, float luong, String username, 
            String password, int maCN) {
        this.maNV = maNV;
        this.hoNV = hoNV;
        this.tenNV = tenNV;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.luong = luong;
        this.username = username;
        this.password = password;
        this.maCN = maCN;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoNV() {
        return hoNV;
    }

    public void setHoNV(String hoNV) {
        this.hoNV = hoNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public void setNgaySinh(LocalDate date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}