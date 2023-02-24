package com.ankit.electric.vehicle.ev.service;

import com.ankit.electric.vehicle.ev.model.ChargingStation;
import com.ankit.electric.vehicle.ev.repository.ChargingStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargingStationServiceImpl implements ChargingStationService {
    @Autowired
    private ChargingStationRepository chargingStationRepository;

    @Override
    public List<ChargingStation> getAllChargingStations() {
        return chargingStationRepository.findAll();
    }

    @Override
    public ChargingStation getChargingStationById(Long id) {
        return chargingStationRepository.findById(id).orElse(null);
    }

    @Override
    public ChargingStation addChargingStation(ChargingStation chargingStation) {
        return chargingStationRepository.save(chargingStation);
    }

    @Override
    public ChargingStation updateChargingStation(Long id, ChargingStation chargingStation) {
        ChargingStation chargingStationToUpdate = chargingStationRepository.findById(id).orElse(null);
        if (chargingStationToUpdate == null) {
            return null;
        }
        chargingStationToUpdate.setStationName(chargingStation.getStationName());
        chargingStationToUpdate.setStationImage(chargingStation.getStationImage());
        chargingStationToUpdate.setStationPricing(chargingStation.getStationPricing());
        chargingStationToUpdate.setStationAddress(chargingStation.getStationAddress());
        return chargingStationRepository.save(chargingStationToUpdate);
    }

    @Override
    public void deleteChargingStation(Long id) {
        chargingStationRepository.deleteById(id);
    }
}