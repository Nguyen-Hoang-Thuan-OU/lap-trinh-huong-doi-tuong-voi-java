package data;

public class HinhVuong {
    private double chieuDaiCanh;
    private String tenNguoiSoHuu;

    public HinhVuong(double chieuDaiCanh, String nguoiSoHuu) {
        this.chieuDaiCanh = chieuDaiCanh;
        this.tenNguoiSoHuu = nguoiSoHuu;
    }

    public double getChieuDaiCanh() {
        return chieuDaiCanh;
    }

    public void setChieuDaiCanh(double chieuDaiCanh) {
        this.chieuDaiCanh = chieuDaiCanh;
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
                chieuDaiCanh, chieuDaiCanh, tenNguoiSoHuu);
    }
}
