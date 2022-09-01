package se.nackademin;

public class Car {
    String regNr;
    boolean light;
    boolean lightOn;
    boolean lightFull;
    boolean backLight;
    boolean power;
    boolean hazard;
    int speed;
    boolean backLightOn = false;
    int gears;

    public Car() {
    }

    public Car(String regNr, boolean light, boolean lightOn, boolean lightFull, boolean backLight, boolean power, boolean hazard
    , int speed) {
        this.regNr = regNr;
        this.light = light;
        this.lightOn = lightOn;
        this.lightFull = lightFull;
        this.backLight = backLight;
        this.power = power;
        this.hazard = hazard;
        this.speed = speed;
    }

    public void accelerate(){
        if (this.power && speed <= 170 && gears >= 1){
            this.speed += 10;
        }
    }

    public void braking(){
        if (this.power && speed > 10 && gears >= 1){
            this.speed -= 10;
            this.backLightOn = true;
        }
    }

    public void onOff(){
        this.power = !power;
        this.lightOn = !lightOn;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isHazard() {
        return hazard;
    }

    public void setHazard(boolean hazard) {
        this.hazard = hazard;
    }

    public boolean isBackLight() {
        return backLight;
    }

    public void setBackLight(boolean backLight) {
        this.backLight = backLight;
    }

    public boolean isLightFull() {
        return lightFull;
    }

    public void setLightFull(boolean lightFull) {
        this.lightFull = lightFull;
    }

    public boolean isLightOn() {
        return lightOn;
    }

    public void setLightOn(boolean lightOn) {
        this.lightOn = lightOn;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
}
