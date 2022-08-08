/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.dao;

import com.connectsqlserver.ConnectToSQLServer;
import com.javaswing.model.HoaDon;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamn
 */
public class HoaDonDao {
    
    public List<HoaDon> getAllHoaDon(){
        List<HoaDon> list = new ArrayList<>();

        Connection conn = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "SELECT hd.MaHD, kh.TenKH, hd.TongTien, hd.Ngay, hd.GhiChu, k.TenKho " +
                     "FROM [HOADON] hd " +
                     "INNER JOIN [KHACHHANG] kh ON hd.MaKH = kh.MaKH " +
                     "INNER JOIN [KHO] k ON hd.MaKho = k.MaKho " +
                     "ORDER BY hd.MaHD;";
        
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            
            ResultSet rs = pre.executeQuery();
            
            while(rs.next()){
                HoaDon hd = new HoaDon();
                
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setTenKH(rs.getString("TenKH"));
                hd.setTongTien(rs.getFloat("TongTien"));
                hd.setNgayTao(rs.getDate("Ngay"));
                hd.setGhiChu(rs.getString("GhiChu"));
                hd.setTenKho(rs.getString("TenKho"));
                
                list.add(hd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return list;
    }
    
    public List<HoaDon> findByName(String name){
        List<HoaDon> list = new ArrayList<>();

        Connection conn = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "SELECT hd.MaHD, kh.TenKH, hd.TongTien, hd.Ngay, hd.GhiChu, k.TenKho " +
                     "FROM [HOADON] hd " +
                     "INNER JOIN [KHACHHANG] kh ON hd.MaKH = kh.MaKH " +
                     "INNER JOIN [KHO] k ON hd.MaKho = k.MaKho " +
                     "WHERE kh.tenKH LIKE '%"+name+"%'" +
                     "ORDER BY hd.MaHD;";
        
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            
            ResultSet rs = pre.executeQuery();
            
            while(rs.next()){
                HoaDon hoaDon = new HoaDon();
                
                hoaDon.setMaHD(rs.getInt("MaHD"));
                hoaDon.setTenKH(rs.getString("TenKH"));
                hoaDon.setTongTien(rs.getFloat("TongTien"));
                hoaDon.setNgayTao(rs.getDate("Ngay"));
                hoaDon.setGhiChu(rs.getString("GhiChu"));
                hoaDon.setTenKho(rs.getString("TenKho"));
                
                list.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return list;
    }
    
}
