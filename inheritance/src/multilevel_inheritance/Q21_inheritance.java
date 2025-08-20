package multilevel_inheritance;
class Appliance {
    void turnOn() {
        System.out.println("Appliance is now ON");
    }

    void turnOff() {
        System.out.println("Appliance is now OFF");
    }
}


class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating");
    }
}


class CeilingFan extends Fan {
    void setSpeed(int level) {
        System.out.println("Ceiling fan speed set to: " + level);
    }
}


public class Q21_inheritance {
    public static void main(String[] args) {
        CeilingFan cf = new CeilingFan();

       
        cf.turnOn();

        cf.rotate();

        cf.setSpeed(3);

        cf.turnOff();
    }
}