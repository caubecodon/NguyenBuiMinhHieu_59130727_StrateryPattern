/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class SoSanhTheoTen  implements ISoSanh<SinhVien> 
{
    public int soSanh(SinhVien o1, SinhVien o2)
    {
        int sSanh = o1.getHoTen().compareTo(o2.getHoTen());
        if (sSanh > 0) {
            return 1;
        }
        if (sSanh < 0) {
            return -1;
        }
        return 0;
    }
    
}