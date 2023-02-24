package com.ankit.electric.vehicle.ev.repository;



import com.ankit.electric.vehicle.ev.model.ChargingStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargingStationRepository extends JpaRepository<ChargingStation, Long> {
}