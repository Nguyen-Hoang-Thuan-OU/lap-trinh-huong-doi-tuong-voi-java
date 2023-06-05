/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

/**
 *
 * @author Admin
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        QuanLyCauHoi ql = new QuanLyCauHoi();
        ql.napDsCauHoi("src/data/cauhoi.txt");
        
        Scanner scanner = new Scanner(System.in);
        ql.luyenTap(scanner);
    }
}
