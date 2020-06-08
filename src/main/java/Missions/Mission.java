package Missions;


import Entities.Coordinates;

public abstract class Mission{


    public Coordinates coordinates;

    public Mission(Coordinates coordinatesToAttack) {
        this.coordinates=coordinatesToAttack;
    }
    // private Coordinates coordinates;   // the cordinat for every mission

    public abstract String misiionAction();

    public abstract void setmisiionAction(String  mission);

    public void begin()
    {
        System.out.println("Beginning Mission!");
    }

    public void cancel()
    {
        System.out.println("Abort Mission!");
    }

    public void finish()
    {
        System.out.println("Finish  Mission!");
    }


    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

}
