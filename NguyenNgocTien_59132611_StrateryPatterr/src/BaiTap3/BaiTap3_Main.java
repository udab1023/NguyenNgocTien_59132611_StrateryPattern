/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author ngoct
 */
public class BaiTap3_Main {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SinhVien sv1 = new SinhVien("Tien",format.parse("1999-09-08"), 8);
        SinhVien sv2 = new SinhVien("Binh",format.parse("1999-10-18"), 6);
        SinhVien sv3 = new SinhVien("Nhan",format.parse("1999-11-28"), 9);
        QLSV l = new QLSV();
        l.them(sv1);
        l.them(sv2);
        l.them(sv3);
        
        l.setsoSanh(new SoSanhTheoTen());
        l.sapXep();
        l.inDS();
        
        System.out.println("//////////////////////\n");
        
        l.setsoSanh(new SoSanhTheoDiem());
        l.sapXep();
        l.inDS();
    }
}
