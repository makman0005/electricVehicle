package com.ankit.electric.vehicle.ev.service;

import com.ankit.electric.vehicle.ev.model.ChargingStation;

import java.util.List;

public interface ChargingStationService {
    List<ChargingStation> getAllChargingStations();
    ChargingStation getChargingStationById(Long id);
    ChargingStation addChargingStation(ChargingStation chargingStation);
    ChargingStation updateChargingStation(Long id, ChargingStation chargingStation);
    void deleteChargingStation(Long id);
}
