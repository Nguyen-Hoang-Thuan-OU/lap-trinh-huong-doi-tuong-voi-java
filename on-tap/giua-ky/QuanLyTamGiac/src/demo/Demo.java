/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;


/**
 *
 * @author Admin
 */
public class Demo {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            TamGiac t = new TamGiac(1, 1, 9);
        } catch (Exception ex) {
            ex.printStackTrace();
            //System.err.println(ex.getMessage());
        }
        
        try {
            TamGiac t1 = new TamGiac(3, 4, 5);
            TamGiac t2 = new TamGiacCan(5, 6);
            TamGiac t3 = new TamGiacDeu(5);
            
            QuanLyTamGiac ql = new QuanLyTamGiac();
            ql.themTamGiac(t1);
            ql.themTamGiac(t2);
            ql.themTamGiac(t3);
            
            ql.layTamGiacTheoLoai("demo.TamGiac")
              .forEach(t -> System.out.println(t));
            
            System.out.println("Tam giac co dien tich max");
            System.out.println(ql.timTGDienTichMax());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
