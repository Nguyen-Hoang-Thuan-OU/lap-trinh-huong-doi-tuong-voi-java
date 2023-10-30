package data;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    private String tenNguoiSoHuu;

    public HinhChuNhat(double chieuDai, double chieuRong, String nguoiSoHuu) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.tenNguoiSoHuu = nguoiSoHuu;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public String getTenNguoiSoHuu() {
        return tenNguoiSoHuu;
    }

    public void setTenNguoiSoHuu(String tenNguoiSoHuu) {
        this.tenNguoiSoHuu = tenNguoiSoHuu;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %s)",
                chieuDai, chieuRong, tenNguoiSoHuu);
    }
}
