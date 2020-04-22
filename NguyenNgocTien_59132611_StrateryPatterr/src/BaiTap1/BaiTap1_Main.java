/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author ngoct
 */
public class BaiTap1_Main {
    public static void main(String[] args) {
        Context x1 = new Context();
        Context x2 = new Context();
        x1.setTinhToan(new Cong());
        x2.setTinhToan(new Tru());
        System.out.println("75 + 12 = " + x1.tinh(75,12));
        System.out.println("54 - 78 = " + x2.tinh(54,78));
    }
}
