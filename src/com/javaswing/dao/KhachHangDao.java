/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.dao;

import com.connectsqlserver.ConnectToSQLServer;
import com.javaswing.model.KhachHang;
import java.sql.Connection;
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
public class KhachHangDao {
    public List<KhachHang> getAllKhachHang(){
        List<KhachHang> list = new ArrayList<>();
        
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "SELECT * FROM [KHACHHANG]";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                KhachHang kh = new KhachHang();
                
                kh.setMaKH(rs.getInt(1));
                kh.setTenKH(rs.getString(2));
                kh.setDiaChi(rs.getString(3));
                kh.setSdt(rs.getInt(4));
                
                list.add(kh);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    
    public List<KhachHang> findByName(String name){
        List<KhachHang> list = new ArrayList<>();
        
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "SELECT * FROM [KHACHHANG] WHERE TenKH LIKE '%"+name+"%'";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                KhachHang kh = new KhachHang();
                
                kh.setMaKH(rs.getInt(1));
                kh.setTenKH(rs.getString(2));
                kh.setDiaChi(rs.getString(3));
                kh.setSdt(rs.getInt(4));
                
                list.add(kh);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return list;
    }
}
