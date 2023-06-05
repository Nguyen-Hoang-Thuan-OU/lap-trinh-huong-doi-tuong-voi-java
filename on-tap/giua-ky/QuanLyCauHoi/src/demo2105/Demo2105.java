/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2105;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

/**
 *
 * @author Admin
 */
public class Demo2105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyCauHoi ql = new QuanLyCauHoi();
        Scanner scanner = new Scanner(System.in);
        try {
            ql.napDsCauHoi("src/data/cauhoi.txt");
            ql.luyenTap(scanner);
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        
    }
    
}
