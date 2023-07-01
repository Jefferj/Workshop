public class Sailboat extends Embarcation {
    private int masts;
    public Sailboat(Captain captain, double basePrice, int productionYear, int additionalValue, double length, int masts) {
        super(captain, basePrice, additionalValue, productionYear, length);
        this.masts = masts;
    }

    public int getMasts() {
        return masts;
    }

    public void setMasts(int masts) {
        this.masts = masts;
    }

    public boolean sizeSailboat(){
        return masts > 4;
    }

}
