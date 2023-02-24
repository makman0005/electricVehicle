package com.ankit.electric.vehicle.ev.model;


import jakarta.persistence.*;


@Entity
@Table(name = "charging_stations")
public class ChargingStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="station_id")
    private Long id;
    @Column(name= "station_name" )
    private String stationName;
    @Column(name= "station_image" )
    private String stationImage;
    @Column(name= "station_pricing" )
    private Float stationPricing;
    @Column(name= "station_address" )
    private String stationAddress;

    public ChargingStation() {}

    public ChargingStation(String stationName, String stationImage, Float stationPricing, String stationAddress) {
        this.stationName = stationName;
        this.stationImage = stationImage;
        this.stationPricing = stationPricing;
        this.stationAddress = stationAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationImage() {
        return stationImage;
    }

    public void setStationImage(String stationImage) {
        this.stationImage = stationImage;
    }

    public Float getStationPricing() {
        return stationPricing;
    }

    public void setStationPricing(Float stationPricing) {
        this.stationPricing = stationPricing;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }
}
