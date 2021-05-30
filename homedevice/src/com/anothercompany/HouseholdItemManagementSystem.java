package com.anothercompany;

import com.company.*;

import java.util.ArrayList;
import java.util.List;

public class HouseholdItemManagementSystem {
    List<Seatable> seatable = new ArrayList<>();
    List<Chargeable> chargeables = new ArrayList<>();
    List<Vehicle> vehicles = new ArrayList<>();

    int temperature = 30;

    public HouseholdItemManagementSystem() {
        Couch couch = new Couch();
        Laptop laptop = new Laptop();
        Bicycle bicycle = new Bicycle();
        TeslaCar teslaCar = new TeslaCar();
        IceCar iceCar = new IceCar();

        seatable.add(couch);
        seatable.add(laptop);
        seatable.add(bicycle);
        seatable.add(teslaCar);
        seatable.add(iceCar);

        chargeables.add(teslaCar);
        chargeables.add(laptop);

        vehicles.add(teslaCar);
        vehicles.add(iceCar);
    }

    public void chargeAllDevices() throws ChargeExplodeException {
        for (Chargeable chargeable : chargeables) {
            chargeable.charge();
            if (temperature > 100) {
                throw new ChargeExplodeException();
            }
        }
    }

    public int getTotalSeats() {
        int i = 0;
        for (Seatable seatable : seatable) {
            i += seatable.getNumberOfSeats();
        }
        return i;
    }

    public void startAllVehicles() {

    }
}
