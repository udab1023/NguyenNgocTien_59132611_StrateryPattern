/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author ngoct
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if (o1.getTen().compareTo(o2.getTen()) > 0)
            return 1;
        else if (o1.getTen().compareTo(o2.getTen()) == 0)
            return 0;
        else return -1;

    }

}
