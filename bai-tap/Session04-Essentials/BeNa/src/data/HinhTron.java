package data;

public class HinhTron {
    private double banKinh;
    private String tenNguoiSoHuu;

    public HinhTron(double banKinh, String tenNguoiSoHuu) {
        this.banKinh = banKinh;
        this.tenNguoiSoHuu = tenNguoiSoHuu;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getTenNguoiSoHuu() {
        return tenNguoiSoHuu;
    }

    public void setTenNguoiSoHuu(String tenNguoiSoHuu) {
        this.tenNguoiSoHuu = tenNguoiSoHuu;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %s)",
                banKinh, tenNguoiSoHuu);
    }
    
    
}
