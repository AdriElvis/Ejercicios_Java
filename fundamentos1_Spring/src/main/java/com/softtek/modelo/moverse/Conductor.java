package com.softtek.modelo.moverse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conductor {
    @Autowired
    private IVehiculo vehiculo;

    public Conductor(IVehiculo vehiculo){
        this.vehiculo=vehiculo;
    }

    public String conducir(){
        return this.vehiculo.moverse();
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
