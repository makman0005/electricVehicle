package com.ankit.electric.vehicle.ev.controller;


import com.ankit.electric.vehicle.ev.model.ChargingStation;
import com.ankit.electric.vehicle.ev.service.ChargingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ChargingStationController {
    @Autowired
    private ChargingStationService chargingStationService;

    @GetMapping("/stations")
    public List<ChargingStation> getAllStations() {
        return chargingStationService.getAllChargingStations();
    }

    @GetMapping("/stations/{id}")
    public ResponseEntity<ChargingStation> getStationById(@PathVariable Long id) {
        ChargingStation chargingStation = chargingStationService.getChargingStationById(id);
        if (chargingStation == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(chargingStation, HttpStatus.OK);
        }
    }

    @PostMapping("/stations")
    public ChargingStation addStation(@RequestBody ChargingStation chargingStation) {
        return chargingStationService.addChargingStation(chargingStation);
    }

    @PutMapping("/stations/{id}")
    public ResponseEntity<ChargingStation> updateStation(@PathVariable Long id, @RequestBody ChargingStation chargingStation) {
        ChargingStation updatedChargingStation = chargingStationService.getChargingStationById(id);
        if (updatedChargingStation == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            updatedChargingStation.setStationName(chargingStation.getStationName());
            updatedChargingStation.setStationImage(chargingStation.getStationImage());
            updatedChargingStation.setStationPricing(chargingStation.getStationPricing());
            updatedChargingStation.setStationAddress(chargingStation.getStationAddress());
            chargingStationService.addChargingStation(updatedChargingStation);
            return new ResponseEntity<>(updatedChargingStation, HttpStatus.OK);
        }
    }

    @DeleteMapping("/stations/{id}")
    public ResponseEntity<Void> deleteStation(@PathVariable Long id) {
        ChargingStation chargingStation = chargingStationService.getChargingStationById(id);
        if (chargingStation == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            chargingStationService.deleteChargingStation(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
