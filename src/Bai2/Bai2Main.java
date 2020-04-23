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
public class Bai2Main {
    public static void main(String[] args) {
        // tao hang hoa
        HangHoa hh1 = new HangHoa("Hàng hóa 1", 100000, "Trạng thái 1");
        HangHoa hh2 = new HangHoa("Hàng hóa 2", 200000, "Trạng thái 2");
        HangHoa hh3 = new HangHoa("Hàng hóa 3", 300000, "Trạng thái 3");
        HangHoa hh4 = new HangHoa("Hàng hóa 4", 400000, "Trạng thái 4");
        HangHoa hh5 = new HangHoa("Hàng hóa 5", 500000, "Trạng thái 5");
        
        // them hang hoa vao gio
        GioHang gh1 = new GioHang();
        gh1.setHinhThucTT(new ThanhToanOnline());
        gh1.them(hh1);
        gh1.them(hh2);
        gh1.them(hh3);
        gh1.them(hh4);
        gh1.them(hh5);

        //in danh sach mat hang trong gio hang 1 + tong tien hang + so tien can thanh toan
        gh1.inDs();
        System.out.println("Tổng tiền hàng: " + gh1.tongTienHang());
        System.out.println("Tổng tiền phải thanh toán: " + gh1.thanhToan());
        
        // tham hang hoa vao gio
        GioHang gh2 = new GioHang();
        gh2.setHinhThucTT(new ThanhToanCOD());
        gh2.them(hh1);
        gh2.them(hh2);
        
        //in danh sach mat hang trong gio hang 2 + tong tien hang + so tien can thanh toan
        gh2.inDs();
        System.out.println("Tổng tiền hàng: " + gh2.tongTienHang());
        System.out.println("Tổng tiền phải thanh toán: " + gh2.thanhToan());
    }
}