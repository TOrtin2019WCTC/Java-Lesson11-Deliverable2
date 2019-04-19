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
public class Bill implements CalculateDiscount {
    private double billAmount;
    
    
    public Bill(double billAmount, Discount discount){
        this.billAmount = billAmount;
    }
    
    public double getBillAmount(){
        return this.billAmount;
    }

    @Override
    public void calculate(double billAmount, Discount discount) {
        
        this.billAmount = billAmount - (billAmount * discount.getPercentage());
        
        
    }
}
