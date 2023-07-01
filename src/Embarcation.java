public abstract class Embarcation {
    private Captain captain;
    private double basePrice;
    private int productionYear;
    private double additionalValue;
    private double length;

    public Embarcation(Captain captain, double basePrice, int productionYear, double additionalValue, double length) {
        this.captain = captain;
        this.basePrice = basePrice;
        this.productionYear = productionYear;
        this.additionalValue = additionalValue;
        this.length = length;
    }

    public double rentalAmount(){
        double rentalAmount = basePrice;
        if (productionYear > 2020){
            rentalAmount += additionalValue;
        }
        return rentalAmount;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(double additionalValue) {
        this.additionalValue = additionalValue;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public java.lang.String toString() {
        return null;
    }
}
