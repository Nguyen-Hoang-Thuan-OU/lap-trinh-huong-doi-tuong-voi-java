/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Admin
 */
public class TamGiacDeu extends TamGiacCan {

    public TamGiacDeu(double abc) throws Exception {
        super(abc, abc);
    }

    @Override
    public String layThongTin() {
        return String.format("a = b = c = %.1f",  this.a);
    }
    
    
}
