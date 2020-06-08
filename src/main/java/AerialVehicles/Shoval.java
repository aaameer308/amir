package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;

public class Shoval extends AerialVehicle implements  AerialVehicleService , AerialIntelligenceVehicle , AerialBdaVehicle , AerialAttackVehicle {

    static  int hourTreatment =150;

    int numOfMissiles = 0;
    String tyoeOfMissiles = null;
    String sensorType = null;
    String cameraType =null;



    public Shoval(String s, int i, String spice250, String sensorType, String pilotName, BdaMission attackMission, int flyingHours, boolean flightStatus) {
        super(pilotName, attackMission, flyingHours, flightStatus);
        this.numOfMissiles=i;
        this.tyoeOfMissiles=s;
        this.cameraType=spice250;
        this.sensorType=sensorType;

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

        String str =this.pilotName + " " + this.getClass().getSimpleName() + " " + this.mission.misiionAction() + " "
                +  this.tyoeOfMissiles + "X" +  this.numOfMissiles ;

        return str;
    }

    @Override
    public String preformBda() {

        String str = this.pilotName + " " + this.getClass().getSimpleName() + " " +
                this.mission.misiionAction() + " " +  this.cameraType;

        return str;
    }

    @Override
    public String collectIntelligence() {

        String str = this.pilotName + " " + this.getClass().getSimpleName() + " " +
                this.mission.misiionAction() + " " +  this.sensorType;

        return str;
    }
}

