/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
/**
 *
 * @author ngoct
 */
public class BaiTap2_Main {
    public static void main(String[] args) {
        HangHoa h1 = new HangHoa("quyt",60000,"trai cay");
        HangHoa h2 = new HangHoa("Tivi",5000000,"do dien tu");
        HangHoa h3 = new HangHoa("ao khoac",200000,"quan ao");
        HangHoa h4 = new HangHoa("noi com",500000,"do gia dung");
        HangHoa h5 = new HangHoa("quat",300000,"do gia dung");
        HangHoa h6 = new HangHoa("lo vi song",2000000,"do gia dung");
    
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
    
        gh1.them(h1);
        gh1.them(h2);
        gh1.them(h3);
        gh2.them(h4);
        gh2.them(h5);
        gh2.them(h6);
        
        gh1.setHinhThucTT(new ThanhToanOnline());
        gh2.setHinhThucTT(new ThanhToanCOD());
        
        gh1.inDS();
        System.out.println("Tong tien hang: "+gh1.tongtienHang());
        System.out.println("So tien khach phai tra: "+ gh1.thanhToan()+"\n");
        
        gh2.inDS();
        System.out.println("Tong tien hang: "+gh2.tongtienHang());
        System.out.println("\n" +"So tien khach phai tra: "+ gh2.thanhToan());
    }
}
