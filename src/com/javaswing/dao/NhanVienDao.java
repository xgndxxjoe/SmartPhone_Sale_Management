/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.dao;

import com.connectsqlserver.ConnectToSQLServer;
import com.javaswing.model.NhanVien;
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
public class NhanVienDao {
    public List<NhanVien> getAllNhanVien(){
        List<NhanVien> list = new ArrayList<>();
        
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        
        String sql = "SELECT * FROM [NHANVIEN]";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                NhanVien nv = new NhanVien();
                
                nv.setMaNV(rs.getInt(1));
                nv.setHoNV(rs.getString(2));
                nv.setTenNV(rs.getString(3));
                nv.setSdt(rs.getInt(4));
                nv.setNgaySinh(rs.getDate(5));
                nv.setGioiTinh(rs.getString(6));
                nv.setDiaChi(rs.getString(7));
                nv.setLuong(rs.getFloat(8));
                nv.setUsername(rs.getString(9));
                nv.setPassword(rs.getString(10));
                nv.setMaCN(rs.getInt(11));
                
                list.add(nv);
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
    
    public void addNV(NhanVien nhanVien){
        Connection conn = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "INSERT INTO [NHANVIEN] (MaNV, HoNV, TenNV, SDT, NgaySinh, GioiTinh,"
                + " DiaChi, Luong, Username, Password, MaCN)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            
            pre.setInt(1, nhanVien.getMaNV());
            pre.setString(2, nhanVien.getHoNV());
            pre.setString(3, nhanVien.getTenNV());
            pre.setInt(4, nhanVien.getSdt());
            pre.setDate(5, nhanVien.getNgaySinh());
            pre.setString(6, nhanVien.getGioiTinh());
            pre.setString(7, nhanVien.getDiaChi());
            pre.setFloat(8, nhanVien.getLuong());
            pre.setString(9, nhanVien.getUsername());
            pre.setString(10, nhanVien.getPassword());
            pre.setInt(11, nhanVien.getMaCN());
            
            int rs = pre.executeUpdate();
            
            if(rs == 1){
                System.out.println("Success.");
            } else {
                System.out.println("Fail!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
    public void deleteNhanVien(NhanVien nhanVien){
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        
        String sql = "DELETE FROM [NHANVIEN] WHERE MaNV = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, nhanVien.getMaNV());
            
            int rs = preparedStatement.executeUpdate();
            if(rs == 1){
                System.out.println("Success");
            } else {
                System.out.println("Fail!");
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
    }
    
    public void updateNhanVien(NhanVien nhanVien){
        Connection conn = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "UPDATE [NHANVIEN] SET HoNV = ?, TenNV = ?, SDT = ?,"
                + "NgaySinh = ?, GioiTinh = ?, DiaChi = ?, Luong = ?, Username = ?,"
                + "Password = ?,  MaCN = ? WHERE MaNV = ?";
        
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            
            pre.setString(1, nhanVien.getHoNV());
            pre.setString(2, nhanVien.getTenNV());
            pre.setInt(3, nhanVien.getSdt());
            pre.setDate(4, nhanVien.getNgaySinh());
            pre.setString(5, nhanVien.getGioiTinh());
            pre.setString(6, nhanVien.getDiaChi());
            pre.setFloat(7, nhanVien.getLuong());
            pre.setString(8, nhanVien.getUsername());
            pre.setString(9, nhanVien.getPassword());
            pre.setInt(10, nhanVien.getMaCN());
            pre.setInt(11, nhanVien.getMaNV());
            
            int rs = pre.executeUpdate();
            
            if(rs == 1){
                System.out.println("Success.");
            } else {
                System.out.println("Fail!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
