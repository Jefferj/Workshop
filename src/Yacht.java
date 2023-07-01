public class Yacht extends Embarcation {
    private int stateRoom;
    public Yacht(Captain captain, double basePrice, int productionYear, int additionalValue, double length, int stateRoom){
        super(captain, basePrice, additionalValue, productionYear, length);
        this.stateRoom = stateRoom;
    }

    public int getStateRoom() {
        return stateRoom;
    }

    public void setStateRoom(int stateRoom) {
        this.stateRoom = stateRoom;
    }

    public boolean luxuryYacht() {
        return stateRoom > 7;
    }

}
