package org.example;

import java.math.BigDecimal;

public class Carro {

    IOdometer odometer;

    OdometerAdapter persistence;


    public Carro() {
        this.odometer = new OdometerKM();
        this.persistence = new OdometerAdapter(odometer);
    }

    public void setOdometer(double distanciaKm){
        this.odometer.setDistanciaKM(distanciaKm);
        persistence.salvarDistancia();
    }

    public double getDistanciaKm(){
        return persistence.recuperarDistanciaKm();
    }

    public double getDistanciaMilha(){
        return persistence.getDistancia();
    }
}
