package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;

public class F15 extends AerialVehicle implements  AerialVehicleService ,AerialAttackVehicle , AerialIntelligenceVehicle{

    static  int hourTreatment =250;
    String sensorType = null;
    int numOfMissiles = 0;
    String tyoeOfMissiles = null;


    public F15(String sensorType, int numOfMissiles, String tyoeOfMissiles, String pilotName, AttackMission attackMission, int flyingHours, boolean flightStatus) {
        super(pilotName, attackMission, flyingHours, flightStatus);
        this.numOfMissiles=numOfMissiles;
        this.tyoeOfMissiles=tyoeOfMissiles;
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

        String str =this.pilotName + ": " + this.getClass().getSimpleName() + " Attacking " + this.mission.misiionAction() + " with: "
                +  this.tyoeOfMissiles + "X" +  this.numOfMissiles ;

        return str;
    }

    @Override
    public String collectIntelligence() {

        String str =this.pilotName + ": " + this.getClass().getSimpleName() + " Collecting Data in " + this.mission.misiionAction()
                + " with sensor type: " +  this.sensorType;
        return str;
    }
}
