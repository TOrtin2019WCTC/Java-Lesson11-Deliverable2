package solid.example;

public class Customer {

    private String customerName;
    //private double billAmount;
    //private char discountType;
    private Discount discount;
    private Bill bill;

    public Customer(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        //this.billAmount = billAmount;
        //this.discountType = discountType;
        setDiscount(discountType);
        this.bill = new Bill(billAmount,discount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

//    public double getBillAmount() {
//        double tempBill;
//        switch (discountType) {
//            case 'S':
//            case 's':
//                tempBill = billAmount - (billAmount * 0.1);
//                break;
//            case 'D':
//            case 'd':
//                tempBill = billAmount - (billAmount * 0.5);
//                break;
//            case 'L':
//            case 'l':
//                tempBill = billAmount - (billAmount * 0.75);
//                break;
//            default:
//                tempBill = billAmount;
//        }
//        return tempBill;
//    }
    
    public double getBillAmount(){
        return this.bill.getBillAmount();
    }
    
    public void setDiscount(char discountType){
        switch(discountType){
            case 'D' :
            case 'd':
                this.discount = new DiscountTypeDiscount();
                break;
            case 'L':
            case 'l':
                this.discount = new DiscountTypeLiquidation();
                break;
            case 'S':
            case 's':
                this.discount = new DiscountTypeSale();
                break;
        }
    }

//    public void setBillAmount(double billAmount) {
//        this.billAmount = billAmount;
//    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + bill.getBillAmount()
                + ", discountType=" + discount.getDiscountType()
                + '}';
    }
}
