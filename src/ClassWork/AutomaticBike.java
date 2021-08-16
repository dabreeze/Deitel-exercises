package ClassWork;

//package motoBike;
public class AutomaticBike {
    int speed;
    int gear = 1;
    boolean state;

    public void turnOn() {
        state = true;
    }

    public void turnOff() {
        state = false;
    }

    public void accelerate() {
        if(speed>=0 && speed<=20){
            gear = 1;
            System.out.println("Current Gear: " + gear);
        }
        if(speed>=21 && speed<=30){
            gear = 2;
            System.out.println("Current Gear: " + gear);
        }
        if(speed>=31 && speed<=40){
            gear = 3;
            System.out.println("Current Gear: " + gear);
        }
        if(speed>=41){
            gear = 4;
            System.out.println("Current Gear: " + gear);
        }

        speed += gear;

    }

    public int getSpeed() {
        return speed;
    }
    public int getGear() {
        return gear;
    }

}