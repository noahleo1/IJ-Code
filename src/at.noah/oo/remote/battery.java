package at.noah.oo.remote;

public class battery {
    private int chargingLevel;
    private int batteryNR;

    public battery(int chargingLevel, int batteryNR) {
        this.chargingLevel = chargingLevel;
        this.batteryNR = batteryNR;
    }

    public int getChargingLevel() {
        return chargingLevel;
    }

    public void setChargingLevel(int chargingLevel) {
        this.chargingLevel = chargingLevel;
    }

    public int getBatteryNR() {
        return batteryNR;
    }
}
