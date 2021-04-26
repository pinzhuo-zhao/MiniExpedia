package com.unimelb.swen30006.miniexpedia;

import com.unimelb.swen30006.Virgin.VirginFlight;

import java.time.LocalDateTime;

/**
 * @program: MiniExpedia
 * @description:
 * @author: Pinzhuo Zhao, StudentID:1043915
 * @create: 2021-04-26 01:41
 **/
public class VirginFlightAdapter implements FlightAdapter {
    private VirginFlight virginFlight;
    private String departure;
    private LocalDateTime departureTime;
    private String destination;

    public VirginFlightAdapter(VirginFlight virginFlight) {
        this.virginFlight = virginFlight;
    }

    public VirginFlightAdapter(String departure, LocalDateTime departureTime, String destination) {
        this.departure = departure;
        this.departureTime = departureTime;
        this.destination = destination;
    }

    @Override
    public String getDeparture() {
       return virginFlight.getDeparture();
    }

    @Override
    public String getDestination() {
        return virginFlight.getDestination();
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return virginFlight.getDepartureTime();
    }
}
