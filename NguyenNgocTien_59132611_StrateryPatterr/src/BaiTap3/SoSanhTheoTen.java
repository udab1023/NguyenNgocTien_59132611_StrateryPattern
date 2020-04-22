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
public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    ArrayList<SinhVien> sv = new ArrayList<>();
    
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if (o1.setTen(sv) > sv.setTen(o2)){
            return 1;
            else if (o1 = o2){
                return 0;
                else return -1;
            }
        }
        return soSanh(o1, o2);
    }
    
}
