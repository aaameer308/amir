package Missions;

import Entities.Coordinates;

public class IntelligenceMission extends Mission implements  MissionService{

    private  String region;


    public IntelligenceMission(String region, Coordinates coordinatesToAttack) {
        super(coordinatesToAttack);
        this.region=region;
    }

    @Override
    public String misiionAction() {
        return  this.region;

    }


    public void setmisiionAction(String region) {
        this.region = region;
    }
}
