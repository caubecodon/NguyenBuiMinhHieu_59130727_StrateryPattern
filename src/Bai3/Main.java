/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
        QLSV qlsv = new QLSV();
        SinhVien sv1 = new SinhVien("Sinh Vien A", fd.parse("01/01/1999"), 6);
        SinhVien sv2 = new SinhVien("Sinh Vien B", fd.parse("02/02/1999"), 7);
        SinhVien sv3 = new SinhVien("Sinh Vien C", fd.parse("03/03/1999"), 8);
        SinhVien sv4 = new SinhVien("Sinh Vien D", fd.parse("04/04/1999"), 9);
        

 
        qlsv.them(sv1);
        qlsv.them(sv2);
        qlsv.them(sv3);
        qlsv.them(sv4);
        


        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("Danh sach sinh vien sap xep theo ten : ");
        qlsv.inDS();

   
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("Danh sach sinh vien sap xep theo diem : ");
        qlsv.inDS();
    }

    
}