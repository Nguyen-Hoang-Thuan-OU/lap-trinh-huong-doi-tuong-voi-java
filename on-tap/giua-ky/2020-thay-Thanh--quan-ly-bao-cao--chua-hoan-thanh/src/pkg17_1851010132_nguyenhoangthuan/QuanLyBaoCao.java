/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_1851010132_nguyenhoangthuan;

import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class QuanLyBaoCao
{
    private ArrayList<BaoCao> danhSachBaoCao = new ArrayList<>();
    
    public void themBaoCaoMoi(BaoCao chuDe)
    {
        this.danhSachBaoCao.add(chuDe);
    }
    
    public void sapXepGiamTheoDiem()
    {
        this.danhSachBaoCao.sort((BaoCao bc1, BaoCao bc2) ->
        {
            return -(bc1.diemBaoCao() - bc2.diemBaoCao());
        });
    }
}
