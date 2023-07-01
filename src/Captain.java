public class Captain {
    private java.lang.String name;

    private java.lang.String lastname;
    //ID SHIP
    private java.lang.String numberShip;
    public Captain(String name, String lastname, String numberShip) {
        this.name = name;
        this.lastname = lastname;
        this.numberShip = numberShip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumberShip() {
        return numberShip;
    }

    public void setNumberShip(String numberShip) {
        this.numberShip = numberShip;
    }
}



