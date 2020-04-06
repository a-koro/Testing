/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author A.Korovesis
 */
public class SomeClass {
    private int x;
    private int y;
    
    public SomeClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getSum() {
        return x+y;
    }
    
    public int getProduct() {
        return x*y;
    }
    
    public double getQuotient() {
        return 1.0*x/y;
    }
}
