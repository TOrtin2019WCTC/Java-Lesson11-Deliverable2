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
public class DiscountTypeLiquidation extends Discount {
    private final double PERCENTAGE = 0.75;
    
    public DiscountTypeLiquidation(){
        
    }
    
    @Override
    public double getPercentage(){
        return PERCENTAGE;
    }

    @Override
    public String getDiscountType() {
        return "Liquidation";
    }
}
