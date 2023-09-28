package org.example;

import java.math.BigDecimal;

public class OdometerAdapter extends OdometerMilha{

    private IOdometer odometerKm;

    private static double KM_TO_MILE = 0.621371;
    private static double MILE_TO_KM = 1.60934;

    public OdometerAdapter(IOdometer odometerKm) {
        this.odometerKm = odometerKm;
    }

    public double recuperarDistanciaKm(){
        this.odometerKm.setDistanciaKM(this.getDistancia()*MILE_TO_KM);
        return this.odometerKm.getDistanciaKM();
    }

    public void salvarDistancia(){
        this.setDistancia(odometerKm.getDistanciaKM()*KM_TO_MILE);
    }
}
