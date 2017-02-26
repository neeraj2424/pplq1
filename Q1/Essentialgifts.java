package ppl_assignment;

/**
 * Created by root on 26/2/17.
 */
public class Essentialgifts {


    private double price;                                    //price of gift
    private double value;                                    //value of gift
    Essentialgifts(double tprice, double tvalue){
        this.price=tprice;
        this.value=tvalue;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }



}
