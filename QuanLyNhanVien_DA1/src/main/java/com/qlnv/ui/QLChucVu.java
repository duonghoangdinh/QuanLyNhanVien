/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlnv.ui;

/**
 *
 * @author HP
 */
public class QLChucVu {
    private String MaNV;
    private String TenCV;

    public QLChucVu(String MaNV, String TenCV) {
        this.MaNV = MaNV;
        this.TenCV = TenCV;
    }

    public QLChucVu() {
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenCV() {
        return TenCV;
    }

    public void setTenCV(String TenCV) {
        this.TenCV = TenCV;
    }
    
    public Object[] toObjectArray() {
        return new Object[]{MaNV, TenCV};
    }
}
