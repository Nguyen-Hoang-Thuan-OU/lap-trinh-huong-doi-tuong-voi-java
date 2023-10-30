/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_1851010132_nguyenhoangthuan;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class BaoCao
{
    private int dem = 1;
    private int maBaoCao = ++dem;
    private String tenBaoCao;
    private String chuoiLink;
    private int ngayBaoCao;
    private String tenSinhVien;
    private String tenGiangVien;
    private double diemBaoCao;
    
    public BaoCao(int maBaoCao, String chuoiLink, int ngayBaoCao,
            String tenSinhVien, String tenGiangVien, double diemBaoCao)
    {
        this.maBaoCao = maBaoCao;
        this.chuoiLink = chuoiLink;
        this.ngayBaoCao = ngayBaoCao;
        this.tenSinhVien = tenSinhVien;
        this.tenGiangVien = tenGiangVien;
    }
    
    public int diemBaoCao()
    {
        Random ngauNhiem = new Random();
        
        float soFloat = ngauNhiem.nextFloat();
        System.out.println("Diem bao cao: " + soFloat);
        return (int) soFloat;
    }
    
    @Override
    public String toString()
    {
        return String.format("\nMa bao cao: %s \nTen bao cao: %s \nNgay bao cao: %d \nTen sinh vien: %s \nTen giang vien: %s \nDiem so: %d",
                this.maBaoCao, this.tenBaoCao, this.ngayBaoCao, this.tenSinhVien, this.tenGiangVien, this.dem);
    }

    //Getter & setter
    
    /**
     * @return the maBaoCao
     */
    public int getMaBaoCao() {
        return maBaoCao;
    }

    /**
     * @param maBaoCao the maBaoCao to set
     */
    public void setMaBaoCao(int maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    /**
     * @return the tenBaoCao
     */
    public String getTenBaoCao() {
        return tenBaoCao;
    }

    /**
     * @param tenBaoCao the tenBaoCao to set
     */
    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    /**
     * @return the chuoiLink
     */
    public String getChuoiLink() {
        return chuoiLink;
    }

    /**
     * @param chuoiLink the chuoiLink to set
     */
    public void setChuoiLink(String chuoiLink) {
        this.chuoiLink = chuoiLink;
    }

    /**
     * @return the ngayBaoCao
     */
    public int getNgayBaoCao() {
        return ngayBaoCao;
    }

    /**
     * @param ngayBaoCao the ngayBaoCao to set
     */
    public void setNgayBaoCao(int ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }

    /**
     * @return the tenSinhVien
     */
    public String getTenSinhVien() {
        return tenSinhVien;
    }

    /**
     * @param tenSinhVien the tenSinhVien to set
     */
    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    /**
     * @return the tenGiangVien
     */
    public String getTenGiangVien() {
        return tenGiangVien;
    }

    /**
     * @param tenGiangVien the tenGiangVien to set
     */
    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    /**
     * @return the diemBaoCao
     */
    public double getDiemBaoCao() {
        return diemBaoCao;
    }

    /**
     * @param diemBaoCao the diemBaoCao to set
     */
    public void setDiemBaoCao(double diemBaoCao) {
        this.diemBaoCao = diemBaoCao;
    }
}
