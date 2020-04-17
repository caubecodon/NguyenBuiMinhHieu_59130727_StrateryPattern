/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class HangHoa {

    String tenHH;
    int gia;
    String moTa;
    
    // contructor
    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    
    // getter
    public int getGia() {
        return gia;
    }
    
    
    // method
    public String thongTinHH() {
        return "Tên hàng hóa: " + this.tenHH
               + ", giá: " + this.gia
               + ", mô tả hàng hóa: " + this.moTa;
    }
}
