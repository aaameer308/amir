package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;

public class F16 extends AerialVehicle implements  AerialVehicleService , AerialAttackVehicle ,AerialBdaVehicle{

    static  int hourTreatment =250;
    String cameraType =null;
    int numOfMissiles = 0;
    String tyoeOfMissiles = null;


    public F16(String thermal, int i, String spice250, String pilotName, AttackMission attackMission, int flyingHours, boolean flightStatus) {
        super(pilotName, attackMission, flyingHours, flightStatus);
    }

    @Override
    public void setMission(IntelligenceMission intelligenceMission) {
        this.mission.setCoordinates(intelligenceMission.coordinates);

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

        String str = this.pilotName + " " + this.getClass().getName() + " " + this.mission.misiionAction() + " "
                +  this.tyoeOfMissiles + "X" +  this.numOfMissiles ;

        return str;
    }

    @Override
    public String preformBda() {

        String str = this.pilotName + " " + this.getClass().getName() + " " +
                this.mission.misiionAction() + " " +  this.cameraType;

        return str;
    }
}
