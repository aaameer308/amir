package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;


public abstract class AerialVehicle {

    String pilotName;
    Mission mission;
    int flyingHours;
    boolean flightStatus;

    public AerialVehicle(String pilotName,Mission attackMission, int flyingHours, boolean flightStatus)
    {
        this.pilotName=pilotName;
        this.mission=attackMission;
        this.flyingHours=flyingHours;
        this.flightStatus=flightStatus;



    }

    public AerialVehicle(String pilotName, BdaMission attackMission, int flyingHours, boolean flightStatus) {
    }


    public  void setMission(Mission intelligenceMission)
    {


    }

    public abstract void setHoursOfFlightSinceLastRepair(int i);

    public abstract int getHoursOfFlightSinceLastRepair();
}
