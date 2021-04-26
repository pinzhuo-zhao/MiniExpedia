package com.unimelb.swen30006.miniexpedia;

import com.unimelb.swen30006.Qantas.QantasFlight;

import java.time.LocalDateTime;

/**
 * @program: MiniExpedia
 * @description:
 * @author: Pinzhuo Zhao, StudentID:1043915
 * @create: 2021-04-26 01:19
 **/
public class QantasFlightAdapter implements FlightAdapter {
    private QantasFlight qantasFlight;
    private String departure;
    private LocalDateTime departureTime;
    private String destination;

    public QantasFlightAdapter(QantasFlight qantasFlight) {
        this.qantasFlight = qantasFlight;
    }

    public QantasFlightAdapter(String departure, LocalDateTime departureTime, String destination) {
        this.departure = departure;
        this.departureTime = departureTime;
        this.destination = destination;
    }

    @Override
    public String getDeparture() {
        return null;
    }

    @Override
    public String getDestination() {
        return null;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return null;
    }
}
