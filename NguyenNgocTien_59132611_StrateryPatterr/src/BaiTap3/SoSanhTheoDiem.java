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
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.getdiemTB()>o2.getdiemTB())
            return 1;
        else if(o1.getdiemTB()==o2.getdiemTB())
            return 0;
        else return -1;
        float value = o2.getdiemTB()- o1.getdiemTB();
        if (value != 0) {
            return (int) value;
        }
         value = o1.getTen().compareTo(o2.getTen());
        return (int) value;
    }
    
}