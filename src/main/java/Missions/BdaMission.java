package Missions;

import Entities.Coordinates;

public class BdaMission extends Mission implements  MissionService{

    private String objective;

    public BdaMission(String suspect_house, Coordinates coordinatesToAttack) {
        super(coordinatesToAttack);
        this.objective=suspect_house;
    }

    @Override
    public String misiionAction() {
        return  this.objective;
    }
}
