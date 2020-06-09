package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;

public class Zik extends AerialVehicle implements  AerialVehicleService , AerialIntelligenceVehicle , AerialBdaVehicle {

    static  int hourTreatment =100;
    String sensorType = null;
    String cameraType =null;



    public Zik(String thermal, String elint, String pilotName, BdaMission attackMission, int flyingHours, boolean flightStatus) {
        super(pilotName, attackMission, flyingHours, flightStatus);
        this.cameraType=thermal;
        this.sensorType=elint;


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
