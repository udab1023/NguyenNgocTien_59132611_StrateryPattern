/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import java.util.ArrayList;
/**
 *
 * @author ngoct
 */
public class GioHang {
    public int tienHang = 0;
    IThanhToan hinhThucTT;
    public double thanhToan(int tienHang){
        return hinhThucTT.thanhToan(tienHang);
    }
    ArrayList<HangHoa> l = new ArrayList<>();
    
    public int tienHang(){
        for (int i = 0; i < l.size(); i++){
            tienHang += l.get(i).getGia(); 
        }
        return tienHang;
    }
    
    public void inDS(){
        System.out.println("Danh sach hang hoa la :");
        for (int i = 0; i < l.size(); i++) {
            System.out.println( "ten hang hoa: "+l.get(i).getTenHH()+
                                "gia: "+l.get(i).getGia()+
                                "mo ta: "+l.get(i).getMoTa());
        }
    }
}
