package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;

public class Shoval extends AerialVehicle implements  AerialVehicleService , AerialIntelligenceVehicle
        , AerialBdaVehicle , AerialAttackVehicle{

    static  int hourTreatment =150;

    int numOfMissiles = 0;
    String tyoeOfMissiles = null;
    String sensorType = null;
    String cameraType =null;

    public Shoval(String s, int i, String spice250, String commint, String lagertha, BdaMission bdaMission, int i1, boolean b) {
        super(lagertha,bdaMission,i1,b);
        this.cameraType=s;
        this.numOfMissiles=i;
        this.tyoeOfMissiles=spice250;
        this.sensorType=commint;

    }


    @Override
    public void setMission(Mission intelligenceMission) {

        this.mission.setCoordinates(intelligenceMission.coordinates);
        this.mission.setmisiionAction(intelligenceMission.misiionAction());
    }

    @Override
    public void setHoursOfFlightSinceLastRepair(int i) {
        this.flyingHours=i;

    }

    @Override
    public int getHoursOfFlightSinceLastRepair() {
        return this.flyingHours;
    }

    @Override
    public void flyTo() {
        System.out.println("Flying to : " + this.mission.coordinates.getLatitude()  + this.mission.coordinates.getLongitude() );

    }

    @Override
    public void land() {
        System.out.println("Landing .. ");

    }

    @Override
    public void check() {

        if(this.flyingHours > hourTreatment)
            repair();
    }

    @Override
    public void repair() {
        this.flightStatus=true;
        this.flyingHours=0;
    }


    @Override
    public String attack() {

        String str= this.pilotName + ": " + this.getClass().getSimpleName() + " Attacking " + this.mission.misiionAction() + " with: "
                +  this.tyoeOfMissiles + "X" +  this.numOfMissiles ;

        return str;
    }

    @Override
    public String preformBda() {

        String str = this.pilotName + ": " + this.getClass().getSimpleName() + " taking pictures of " +
                this.mission.misiionAction() + " with: " +  this.cameraType + " camera";

        return str;
    }

    @Override
    public String collectIntelligence() {


        String str =this.pilotName + ": " + this.getClass().getSimpleName() + " Collecting Data in " + this.mission.misiionAction()
                + " with sensor type: " +  this.sensorType;
        return str;

    }
}

