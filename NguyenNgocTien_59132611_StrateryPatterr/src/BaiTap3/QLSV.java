/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.ArrayList;
/**
 *
 * @author ngoct
 */
public class QLSV {
    
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;
    public void setsoSanh(ISoSanh<SinhVien> sosanh)
    {
        this.soSanh = sosanh;
    }
    public void them(SinhVien s){
        dsSV.add(s);
    }
    

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
    
    public void sapXep(){   
        dsSV.sort((o1,o2)->
        {
            return soSanh.soSanh(o1, o2);
        });
    }

    public void inDS(){
        System.out.println("Danh sach sinh vien là: ");
        for (int i = 0; i < dsSV.size(); i++) {
            System.out.println( "ten sinh vien: "+dsSV.get(i).getTen()+"\n"+
                                "ngay sinh: "+dsSV.get(i).getNgaySinh()+"\n"+
                                "diem TB: "+dsSV.get(i).getdiemTB()+"\n");
    }
}

}