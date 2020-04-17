/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class GioHang {
    // arraylist
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHangHoa = new ArrayList<>();
    
    // setter
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    // method
    // them hang hoa
    public void them(HangHoa hangHoa) {
        dsHangHoa.add(hangHoa);
    }
    
    // tong tien hang
    public int tongTienHang() {
        //toan tu thua ke
        //vong lap for de tinh tong tien
        int tong = 0;
        for (HangHoa hangHoa : dsHangHoa) {
            tong += hangHoa.getGia();
        }
        return tong;
    }
    // tong tien can thanh toan
    public double thanhToan() {
        //toan tu thua ke
        //vong lap for de tinh so tien can thanh toan
        int tien = 0;
        for (HangHoa hangHoa : dsHangHoa) {
            tien += hangHoa.getGia();
        }
        return hinhThucTT.thanhToan(tien);
    }
    // in danh sach hang hoa
    public void inDs() {
        dsHangHoa.forEach(hh -> System.out.println("Hàng hóa: " + hh.thongTinHH()));
    }
}
