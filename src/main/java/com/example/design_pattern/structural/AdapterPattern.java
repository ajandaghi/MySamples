package com.example.design_pattern.structural;

import lombok.extern.slf4j.Slf4j;

public class AdapterPattern {
    public static void main(String[] args) {
        Captain captain = new Captain(new SpeedAdapter());
        captain.showSpeed();
    }
}


class Speed {
    public void showSpeedInKnot(){
        System.out.println("Speed is In Knot");

    }
}

 class Speedo {
    public void showSpeedInKm_h() {
        System.out.println("Speed is In Km_h");
    }
}

 class Captain {

    private final Speed speed;
    // default constructor and setter for rowingBoat
    public Captain(Speed speed) {
        this.speed = speed;
    }

    public void showSpeed() {
        speed.showSpeedInKnot();
    }
}


class SpeedAdapter extends Speed {

    private final Speedo speedo;

    public SpeedAdapter() {
        speedo = new Speedo();
    }

    @Override
    public void showSpeedInKnot() {
        speedo.showSpeedInKm_h();
    }
}


