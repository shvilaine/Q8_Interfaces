public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters) {
        if(this.flying) {
            this.altitude = Math.min(this.altitude + meters, 150);
            System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
    }

    @Override
    public int descend(int meters) {
        if(this.flying) {
            this.altitude = Math.max(this.altitude - meters, 1);
            System.out.printf("%s flies downwards, altitude: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude == 1) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }
}
