/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.Date;
/**
 *
 * @author ngoct
 */
public class SinhVien {
    private String Ten;
    private Date ngaySinh;
    private float diemTB;

    public SinhVien(String Ten, Date ngaySinh, float diemTB) {
        this.Ten = Ten;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    
}
