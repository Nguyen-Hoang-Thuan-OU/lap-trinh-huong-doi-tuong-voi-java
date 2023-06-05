/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_1851010013_nguyennguyetphuongbao;

/**
 *
 * @author Admin
 */
public class Dislike extends Action{
    BaiViet bv;
    {
        diem -=1;
    }

    @Override
    public String toString() {
        return String.format("Tiec that !!Co nguo vua dislike bai viet  cua ban!!!");
    //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
