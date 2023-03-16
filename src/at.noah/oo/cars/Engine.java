package at.noah.oo.cars;

public class Engine {
    private String engineType;
    private int enginePower;

    public Engine(String engineType, int enginePower) {
        this.engineType = engineType;
        this.enginePower = enginePower;
    }
//..
    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
