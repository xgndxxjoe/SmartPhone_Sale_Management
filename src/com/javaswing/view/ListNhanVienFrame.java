/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.view;

import com.javaswing.model.NhanVien;
import com.javaswing.service.NhanVienService;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamn
 */
public class ListNhanVienFrame extends javax.swing.JFrame {
    
    NhanVien nhanVien;
    NhanVienService nhanVienService;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form ListNhanVienFrame
     */
    public ListNhanVienFrame() {
        initComponents();
        
        setLocation(380, 160);
        
        nhanVien = new NhanVien();
        nhanVienService = new NhanVienService();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        ListNhanVienTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Ma NV");
        defaultTableModel.addColumn("Ho");
        defaultTableModel.addColumn("Ten");
        defaultTableModel.addColumn("SDT");
        defaultTableModel.addColumn("Ngay Sinh");
        defaultTableModel.addColumn("Gioi Tinh");
        defaultTableModel.addColumn("Dia Chi");
        defaultTableModel.addColumn("Luong");
        defaultTableModel.addColumn("Username");
        defaultTableModel.addColumn("Password");
        defaultTableModel.addColumn("Ma CN");
        
        List<NhanVien> list = nhanVienService.getAllNhanVien();
        
        for (NhanVien nv : list) {
            defaultTableModel.addRow(new Object[]{nv.getMaNV(), nv.getHoNV(),
                nv.getTenNV(), nv.getSdt(), nv.getNgaySinh(), nv.getGioiTinh(),
                nv.getDiaChi(), nv.getLuong(), nv.getUsername(), nv.getPassword(),
                nv.getMaCN()});
        }
    }

    public void fillTable(){
        defaultTableModel.setRowCount(0);
        
        List<NhanVien> list = nhanVienService.getAllNhanVien();
        
        for (NhanVien nv : list) {
            defaultTableModel.addRow(new Object[]{nv.getMaNV(), nv.getHoNV(),
                nv.getTenNV(), nv.getSdt(), nv.getNgaySinh(), nv.getGioiTinh(),
                nv.getDiaChi(), nv.getLuong(), nv.getUsername(), nv.getPassword(),
                nv.getMaCN()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListNhanVienTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        filterButton = new javax.swing.JButton();
        maNVTextField = new javax.swing.JTextField();
        hoNVTextField = new javax.swing.JTextField();
        tenNVTextField = new javax.swing.JTextField();
        sdtTextField = new javax.swing.JTextField();
        diachiTextField = new javax.swing.JTextField();
        ngaySinhTextField = new javax.swing.JTextField();
        luongTextField = new javax.swing.JTextField();
        gioiTinhTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        paswordTextField = new javax.swing.JTextField();
        maCNComboBox = new javax.swing.JComboBox<>();
        addNVButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUAN LY NHAN VIEN");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ListNhanVienTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ListNhanVienTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListNhanVienTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListNhanVienTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListNhanVienTable);

        jLabel2.setText("Ma NV :");

        jLabel3.setText("Ho :");

        jLabel4.setText("Ten :");

        jLabel5.setText("SDT :");

        jLabel6.setText("Dia chi :");

        jLabel7.setText("Ngay sinh :");

        jLabel8.setText("Gioi tinh :");

        jLabel9.setText("Luong :");

        jLabel10.setText("Username :");

        jLabel11.setText("Password :");

        jLabel12.setText("Ma CN :");

        filterButton.setText("Loc");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        maCNComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CN 1", "CN 2", "CN 3", "CN 4", "CN 5", "CN 6" }));
        maCNComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maCNComboBoxActionPerformed(evt);
            }
        });

        addNVButton.setText("Them  Moi");
        addNVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNVButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Cap Nhap");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Xoa");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(198, 198, 198)
                .addComponent(backButton)
                .addGap(24, 24, 24))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hoNVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tenNVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maNVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel6))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gioiTinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ngaySinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(diachiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(luongTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addNVButton)
                            .addComponent(sdtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(updateButton)
                        .addGap(52, 52, 52)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maCNComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(filterButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(paswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(maNVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diachiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(hoNVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngaySinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(filterButton)
                    .addComponent(tenNVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gioiTinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maCNComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(sdtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luongTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNVButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(refreshButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new MenuManage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void maCNComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maCNComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maCNComboBoxActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        StringBuilder sb = new StringBuilder();
        if(maNVTextField.getText().equals("")){
            sb.append("Ma NV khong duoc de trong! \n");
            maNVTextField.setBackground(Color.red);
        } else {
            maNVTextField.setBackground(Color.white);
        }
        if(hoNVTextField.getText().equals("")){
            sb.append("Ho NV khong duoc de trong! \n");
            hoNVTextField.setBackground(Color.red);
        } else {
            hoNVTextField.setBackground(Color.white);
        }
        if(tenNVTextField.getText().equals("")){
            sb.append("Ten NV khong duoc de trong! \n");
            tenNVTextField.setBackground(Color.red);
        } else {
            tenNVTextField.setBackground(Color.white);
        }
        if(sdtTextField.getText().equals("")){
            sb.append("SDT khong duoc de trong! \n");
            sdtTextField.setBackground(Color.red);
        } else {
            sdtTextField.setBackground(Color.white);
        }
        if(ngaySinhTextField.getText().equals("")){
            sb.append("Ngay sinh khong duoc de trong! \n");
            ngaySinhTextField.setBackground(Color.red);
        } else {
            ngaySinhTextField.setBackground(Color.white);
        }
        if(diachiTextField.getText().equals("")){
            sb.append("Dia chi khong duoc de trong! \n");
            diachiTextField.setBackground(Color.red);
        } else {
            diachiTextField.setBackground(Color.white);
        }
        if(gioiTinhTextField.getText().equals("")){
            sb.append("Gioi tinh khong duoc de trong! \n");
            gioiTinhTextField.setBackground(Color.red);
        } else {
            gioiTinhTextField.setBackground(Color.white);
        }
        if(luongTextField.getText().equals("")){
            sb.append("Luong khong duoc de trong! \n");
            luongTextField.setBackground(Color.red);
        } else {
            luongTextField.setBackground(Color.white);
        }
        if(usernameTextField.getText().equals("")){
            sb.append("Username khong duoc de trong! \n");
            usernameTextField.setBackground(Color.red);
        } else {
            usernameTextField.setBackground(Color.white);
        }
        if(paswordTextField.getText().equals("")){
            sb.append("Password khong duoc de trong! \n");
            paswordTextField.setBackground(Color.red);
        } else {
            paswordTextField.setBackground(Color.white);
        }
        
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        List<NhanVien> list = new ArrayList<>();
        list = nhanVienService.getAllNhanVien();
        nhanVien = new NhanVien();
        int maNV = Integer.parseInt(maNVTextField.getText());
        
        for (NhanVien nv : list) {
            if(nv.getMaNV()== maNV){
                nhanVien.setMaNV(Integer.parseInt(maNVTextField.getText()));
                nhanVien.setHoNV(hoNVTextField.getText());
                nhanVien.setTenNV(tenNVTextField.getText());
                nhanVien.setSdt(Integer.parseInt(sdtTextField.getText()));
                nhanVien.setNgaySinh(Date.valueOf(ngaySinhTextField.getText()));
                nhanVien.setGioiTinh(gioiTinhTextField.getText());
                nhanVien.setDiaChi(diachiTextField.getText());
                nhanVien.setLuong(Float.parseFloat(luongTextField.getText()));
                nhanVien.setUsername(usernameTextField.getText());
                nhanVien.setPassword(paswordTextField.getText());
                nhanVien.setMaCN(maCNComboBox.getSelectedIndex() + 1);
                
                break;
            }
        }
        
        nhanVienService.updateNhanVien(nhanVien);
        fillTable();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addNVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNVButtonActionPerformed
        StringBuilder sb = new StringBuilder();
        if(maNVTextField.getText().equals("")){
            sb.append("Ma NV khong duoc de trong! \n");
            maNVTextField.setBackground(Color.red);
        } else {
            maNVTextField.setBackground(Color.white);
        }
        if(hoNVTextField.getText().equals("")){
            sb.append("Ho NV khong duoc de trong! \n");
            hoNVTextField.setBackground(Color.red);
        } else {
            hoNVTextField.setBackground(Color.white);
        }
        if(tenNVTextField.getText().equals("")){
            sb.append("Ten NV khong duoc de trong! \n");
            tenNVTextField.setBackground(Color.red);
        } else {
            tenNVTextField.setBackground(Color.white);
        }
        if(sdtTextField.getText().equals("")){
            sb.append("SDT khong duoc de trong! \n");
            sdtTextField.setBackground(Color.red);
        } else {
            sdtTextField.setBackground(Color.white);
        }
        if(ngaySinhTextField.getText().equals("")){
            sb.append("Ngay sinh khong duoc de trong! \n");
            ngaySinhTextField.setBackground(Color.red);
        } else {
            ngaySinhTextField.setBackground(Color.white);
        }
        if(diachiTextField.getText().equals("")){
            sb.append("Dia chi khong duoc de trong! \n");
            diachiTextField.setBackground(Color.red);
        } else {
            diachiTextField.setBackground(Color.white);
        }
        if(gioiTinhTextField.getText().equals("")){
            sb.append("Gioi tinh khong duoc de trong! \n");
            gioiTinhTextField.setBackground(Color.red);
        } else {
            gioiTinhTextField.setBackground(Color.white);
        }
        if(luongTextField.getText().equals("")){
            sb.append("Luong khong duoc de trong! \n");
            luongTextField.setBackground(Color.red);
        } else {
            luongTextField.setBackground(Color.white);
        }
        if(usernameTextField.getText().equals("")){
            sb.append("Username khong duoc de trong! \n");
            usernameTextField.setBackground(Color.red);
        } else {
            usernameTextField.setBackground(Color.white);
        }
        if(paswordTextField.getText().equals("")){
            sb.append("Password khong duoc de trong! \n");
            paswordTextField.setBackground(Color.red);
        } else {
            paswordTextField.setBackground(Color.white);
        }
        
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        nhanVien = new NhanVien();
        
        nhanVien.setMaNV(Integer.parseInt(maNVTextField.getText()));
        nhanVien.setHoNV(hoNVTextField.getText());
        nhanVien.setTenNV(tenNVTextField.getText());
        nhanVien.setSdt(Integer.parseInt(sdtTextField.getText()));
        nhanVien.setNgaySinh(Date.valueOf(ngaySinhTextField.getText()));
        nhanVien.setGioiTinh(gioiTinhTextField.getText());
        nhanVien.setDiaChi(diachiTextField.getText());
        nhanVien.setLuong(Float.parseFloat(luongTextField.getText()));
        nhanVien.setUsername(usernameTextField.getText());
        nhanVien.setPassword(paswordTextField.getText());
        nhanVien.setMaCN(maCNComboBox.getSelectedIndex() + 1);
        
        nhanVienService.addNhanVien(nhanVien);
        
        fillTable();
    }//GEN-LAST:event_addNVButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        List<NhanVien> list = nhanVienService.getAllNhanVien();
        
        int selected = ListNhanVienTable.getSelectedRow();
        
        if(selected >= 0){
            int maNV = (int) ListNhanVienTable.getValueAt(selected, 0);
            for (NhanVien nhanVien : list) {
                if(nhanVien.getMaNV() == maNV){
                    nhanVienService.deleteNhanVien(nhanVien);
                    break;
                }
            }
        }
        
        fillTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        maNVTextField.setText("");
        hoNVTextField.setText("");
        tenNVTextField.setText("");
        sdtTextField.setText("");
        ngaySinhTextField.setText("");
        gioiTinhTextField.setText("");
        diachiTextField.setText("");
        luongTextField.setText("");
        usernameTextField.setText("");
        paswordTextField.setText("");
        maCNComboBox.setSelectedIndex(0);
        
        fillTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        defaultTableModel.setRowCount(0); // xoa du lieu tat ca cac hang
        List<NhanVien> list = new ArrayList<>();
        int selected = maCNComboBox.getSelectedIndex() + 1;
        
        list = nhanVienService.getAllNhanVien();
        
        for (NhanVien nv : list) {
            if(nv.getMaCN() == selected){
                defaultTableModel.addRow(new Object[]{nv.getMaNV(), nv.getHoNV(),
                nv.getTenNV(), nv.getSdt(), nv.getNgaySinh(), nv.getGioiTinh(),
                nv.getDiaChi(), nv.getLuong(), nv.getUsername(), nv.getPassword(),
                nv.getMaCN()});
            }
        }
    }//GEN-LAST:event_filterButtonActionPerformed

    private void ListNhanVienTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListNhanVienTableMouseClicked
        List<NhanVien> list = nhanVienService.getAllNhanVien();
        int selectedRow = ListNhanVienTable.getSelectedRow();
        if(selectedRow >= 0){
            int maNV = (int) ListNhanVienTable.getValueAt(selectedRow, 0);
            
            for (NhanVien nv : list) {
                if(maNV == nv.getMaNV()){
                    maNVTextField.setText("" + nv.getMaNV());
                    hoNVTextField.setText(nv.getHoNV());
                    tenNVTextField.setText(nv.getTenNV());
                    sdtTextField.setText("" + nv.getSdt());
                    ngaySinhTextField.setText("" + nv.getNgaySinh());
                    gioiTinhTextField.setText(nv.getGioiTinh());
                    diachiTextField.setText(nv.getDiaChi());
                    luongTextField.setText("" + nv.getLuong());
                    usernameTextField.setText(nv.getUsername());
                    paswordTextField.setText(nv.getPassword());
                    maCNComboBox.setSelectedIndex(nv.getMaCN()-1);
                    break;
                }
            }
        }
    }//GEN-LAST:event_ListNhanVienTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListNhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListNhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListNhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListNhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListNhanVienFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListNhanVienTable;
    private javax.swing.JButton addNVButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField diachiTextField;
    private javax.swing.JButton filterButton;
    private javax.swing.JTextField gioiTinhTextField;
    private javax.swing.JTextField hoNVTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField luongTextField;
    private javax.swing.JComboBox<String> maCNComboBox;
    private javax.swing.JTextField maNVTextField;
    private javax.swing.JTextField ngaySinhTextField;
    private javax.swing.JTextField paswordTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField sdtTextField;
    private javax.swing.JTextField tenNVTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
