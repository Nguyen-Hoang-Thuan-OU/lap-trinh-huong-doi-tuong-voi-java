/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyCauHoi {
    private List<CauHoi> ds = new ArrayList<>();
    
    public void themCauHoi(CauHoi ch) {
        this.ds.add(ch);
    }
    
    public void luyenTap(Scanner scanner) {
        Collections.shuffle(this.ds);
        this.ds.forEach(ch -> {
            System.out.println(ch);
            System.out.print("Đáp án của bạn: ");
            int idx = scanner.nextInt();
            
            if (ch.isChinhXac(idx - 1) == true)
                System.out.println("CHÍNH XÁC!!!");
            else
                System.out.println("SAI RỒI!!!");
        });
    }
    
    public void napDsCauHoi(String path) throws FileNotFoundException {
        File f = new File(path);
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()) {
                String ch = scanner.nextLine();
                String a = scanner.nextLine();
                String b = scanner.nextLine();
                String c = scanner.nextLine();
                String d = scanner.nextLine();
                int idx = Integer.parseInt(scanner.nextLine());
                
                CauHoi ch1 = new CauHoi(ch);
        
                PhuongAn a1 = new PhuongAn(a);
                PhuongAn b1 = new PhuongAn(b);
                PhuongAn c1 = new PhuongAn(c);
                PhuongAn d1 = new PhuongAn(d);
                List<PhuongAn> pa = new ArrayList<>();
                pa.addAll(
                        Arrays.asList(new PhuongAn[] {a1, b1, c1, d1}));
                
                ch1.setPhuongAn(pa);
                ch1.setDapAn(pa.get(idx));
                
                this.themCauHoi(ch1);
            }
        }
        
    }

    /**
     * @return the ds
     */
    public List<CauHoi> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<CauHoi> ds) {
        this.ds = ds;
    }
}
