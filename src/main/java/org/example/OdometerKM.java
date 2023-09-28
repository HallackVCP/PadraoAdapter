package org.example;

public class OdometerKM implements IOdometer{

    private double distanciaKM;

    @Override
    public double getDistanciaKM() {
        return this.distanciaKM;
    }

    @Override
    public void setDistanciaKM(double distanciaKM) {
        this.distanciaKM = distanciaKM;
    }
}
