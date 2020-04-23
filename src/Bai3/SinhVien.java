/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class SinhVien {
    public String hoTen;
    public Date ngaySinh;
    public float diemTB;

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public String getThongTin() {
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyy");
        return "Ho Ten: " + this.hoTen + "Ngay Sinh: " + formaterDate.format(this.ngaySinh) + "Diem Trung Binh: " + this.diemTB;
    }

    
}
