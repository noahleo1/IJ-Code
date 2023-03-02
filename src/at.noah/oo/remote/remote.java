package at.noah.oo.remote;

import java.util.ArrayList;
import java.util.List;

public class remote {
    private List<battery> batteries;

    public remote() {
        this.batteries = new ArrayList<>();
    }

    public void addbatteries(battery batteries ) {
        this.batteries.add(batteries);
    }

    public void getStatus(){
        int amountOfBatteries = this.batteries.size();
        int sum = 0;
        for (int i = 0; i < amountOfBatteries; i++){
            sum = sum + this.batteries.get(i).getChargingLevel();

        }
        int avg= sum/amountOfBatteries;
        System.out.println("The average loading of the batteries is: " + avg);
    }
    public void turnOff(){
        int newlvl = 0;
        int i = 1;

        newlvl = (this.batteries.get().getChargingLevel() -5) ;
        this.batteries.get(i).setChargingLevel(newlvl);
        System.out.println("Verbraucher angeschlossen");
        System.out.println("Neuer Leistungsstand: "+newlvl+"%");
    }

}
