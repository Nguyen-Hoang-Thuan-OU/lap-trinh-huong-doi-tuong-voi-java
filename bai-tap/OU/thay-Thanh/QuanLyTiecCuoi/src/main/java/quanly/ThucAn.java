/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;

/**
 *
 * @author duyloc
 */

public class ThucAn extends MonAn{
	private String anChay;

	public ThucAn(int maMon, String tenMon, double giaBan, String anChay) {
		super(maMon, tenMon, giaBan);
		this.anChay = anChay;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("Mã món: TA-%03d  ---  ", this.maMon);
		super.showInfo();	
		System.out.printf("Ăn chay: %s\n", this.anChay);
	}
	
	public String getAnChay() {
		return anChay;
	}

	public void setAnChay(String anChay) {
		this.anChay = anChay;
	}	
}
