package com.ou.gameboom.gamedatbom;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class QuanLyNhanVat {
    private List<NhanVat> danhSachNhanVat = new ArrayList<>();
    
    public void hienThiMauThongTinChungCuaNhanVan() {
        System.out.printf("| %-5s | %-15s | %-9s | %-9s | %-7s | %-19s |\n",
                "Ma NV", "Ten nhan vat",
                "Luot choi", "Luong mau",
                "Tong VP", "Danh sach vat pham");
    }
    
    public void hienThiDanhSachNhanVat() {
        danhSachNhanVat.forEach(x -> x.hienThiThongTinNhanVat());
    }
    
    // 1. Thêm nhân vật vào danh sách
    public void themMotNhanVatVaoDanhSach(NhanVat nvMoi) {
        danhSachNhanVat.add(nvMoi);
    }
    
    // 4. Tìm tổng số lượt chơi của nhân vật theo mã nhân vật
    public int timTongSoLuotChoiTheoMaNV(int maNV) {
        if(!danhSachNhanVat.isEmpty()) {
            try {
                return danhSachNhanVat.stream().filter(x -> x.getMaNhanVat() == maNV)
                        .findFirst().get().demSoLuongLuotChoi();                
            } catch (NoSuchElementException nsee) {
                return -1;
            }
        }
        
        return -1;
    }
    
    // 5. Tìm các (danh sách) nhân vật có số máu nhiều nhất
    public List<NhanVat> timDanhSachNVCoSoMauNhieuNhat() {
        if(!danhSachNhanVat.isEmpty()) {
            NhanVat nhanVatCoMauNhieuNhat = danhSachNhanVat.stream()
                    .max((nv1, nv2) -> nv1.demSoLuongMau() - nv2.demSoLuongMau()).get();
            
            // Lấy ra những nhân vật có lượng máu
            // tương đương với nhân vật có lượng máu nhiều nhất
            return danhSachNhanVat.stream()
                    .filter(x -> x.demSoLuongMau() == nhanVatCoMauNhieuNhat.demSoLuongMau())
                    .collect(Collectors.toList());
        }
        
        return null;
    }
    
    // 6.1. Sắp xếp nhân vật giảm dần theo số lượng vật phẩm
    public void sapXepNVGiamDanTheoSoLuongVatPham() {
        danhSachNhanVat.sort((x1, x2) -> -(x1.getDanhSachVatPham().size() - x2.getDanhSachVatPham().size()));
    }
    
    // 6.2. Sắp xếp nhân vật giảm dần theo số máu
    public void sapXepNVGiamDanTheoSoLuongMau() {
        danhSachNhanVat.sort((x1, x2) -> -(x1.demSoLuongMau() - x2.demSoLuongMau()));
    }
    
    // 6.3. Sắp xếp nhân vật giảm dần theo số lượt chơi
    public void sapXepNVGiamDanTheoSoLuongLuotChoi() {
        danhSachNhanVat.sort((x1, x2) -> -(x1.demSoLuongLuotChoi() - x2.demSoLuongLuotChoi()));
    }

    public List<NhanVat> getDanhSachNhanVat() {
        return danhSachNhanVat;
    }

    public void setDanhSachNhanVat(List<NhanVat> danhSachNhanVat) {
        this.danhSachNhanVat = danhSachNhanVat;
    }
    
    
}
