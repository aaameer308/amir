package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;


public abstract class AerialVehicle {

    String pilotName;
    Mission mission;
    int flyingHours;
    boolean flightStatus;

    public AerialVehicle(String pilotName, AttackMission attackMission, int flyingHours, boolean flightStatus)
    {
        this.pilotName=pilotName;
        this.mission=attackMission;
        this.flyingHours=flyingHours;
        this.flightStatus=flightStatus;



    }


    public abstract void setMission(IntelligenceMission intelligenceMission);


    public abstract void setHoursOfFlightSinceLastRepair(int i);

    public abstract int getHoursOfFlightSinceLastRepair();
}
