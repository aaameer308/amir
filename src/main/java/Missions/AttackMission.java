package Missions;

import Entities.Coordinates;

public class AttackMission extends Mission {

    private  String target;

    public AttackMission(String suspect_house, Coordinates coordinatesToAttack) {
        super(coordinatesToAttack);
        this.target=suspect_house;
        //super(coordinatesToAttack);
    }

    public AttackMission(Coordinates coordinatesToAttack) {
        super(coordinatesToAttack);
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }


    @Override
    public String misiionAction() {
        return  this.target;
    }
}
