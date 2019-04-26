/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.example;

/**
 *
 * @author tim
 */
public class NoDiscount extends Discount {

    private final double PERCENTAGE = 0.0;
    @Override
    public String getDiscountType() {
        return "No Discount";
    }

    @Override
    public double getPercentage() {
        return PERCENTAGE;
    }
    
}
