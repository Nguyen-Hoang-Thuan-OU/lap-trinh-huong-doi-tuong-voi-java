package bena;

import data.HinhChuNhat;
import data.HinhVuong;
import data.HinhTron;
import java.util.Scanner;

public class BeNa {

    public static void main(String[] args) {
//        inputHinhChuNhat();
//        inputHinhVuong();
        inputHinhTron();
    }
    
    public static void inputHinhTron() {
        double banKinh;
        String tenNguoiSoHuu;

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập bán kính: ");
                banKinh = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập sai, vui lòng nhập lại");
            }
        }

        System.out.print("Nhập tên người sở hữu: ");
        tenNguoiSoHuu = sc.nextLine();
        
        HinhTron ht1 = new HinhTron(banKinh, tenNguoiSoHuu);
        String ht = ht1.toString();
        System.out.println("HT1: " + ht);
    }

    public static void inputHinhVuong() {
        double chieuDaiCanh;
        String tenNguoiSoHuu;

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập chiều dài cạnh: ");
                chieuDaiCanh = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập sai, vui lòng nhập lại");
            }
        }

        System.out.print("Nhập tên người sở hữu: ");
        tenNguoiSoHuu = sc.nextLine();
        
        HinhVuong hv1 = new HinhVuong(chieuDaiCanh, tenNguoiSoHuu);
        String hv = hv1.toString();
        System.out.println("HV1: " + hv);
    }
    
    public static void inputHinhChuNhat() {
        double chieuDai;
        double chieuRong;
        String tenNguoiSoHuu;

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập chiều dài: ");
                chieuDai = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập sai, vui lòng nhập lại");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập chiều rộng: ");
                chieuRong = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập sai, vui lòng nhập lại");
            }
        }

        System.out.print("Nhập tên người sở hữu: ");
        tenNguoiSoHuu = sc.nextLine();
        
        HinhChuNhat hcn1 = new HinhChuNhat(chieuDai, chieuRong, tenNguoiSoHuu);
        String hcn = hcn1.toString();
        System.out.println("HCN1: " + hcn);
    }
}
