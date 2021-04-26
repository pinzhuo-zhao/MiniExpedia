package com.unimelb.swen30006.miniexpedia;

import com.unimelb.swen30006.Virgin.VirginFlight;
import com.unimelb.swen30006.Virgin.VirginSearch;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @program: MiniExpedia
 * @description:
 * @author: Pinzhuo Zhao, StudentID:1043915
 * @create: 2021-04-26 01:38
 **/
public class VirginSearchAdapter implements SearchAdapter {
    private VirginSearch virginSearch = new VirginSearch();
    @Override
    public ArrayList<FlightAdapter> search(ArrayList<FlightAdapter> flights, int numPassengers) {
        ArrayList<VirginFlight> results = new ArrayList<>();
        for (FlightAdapter flight : flights) {
            String departure = flight.getDeparture();
            String destination = flight.getDestination();
            LocalDateTime departureTime = flight.getDepartureTime();
            ArrayList<VirginFlight> result = virginSearch.search(departure, destination, departureTime, numPassengers);
            results.addAll(result);
        }

        ArrayList<FlightAdapter> adaptedResults = new ArrayList<FlightAdapter>();
        for (VirginFlight flight : results) {
            adaptedResults.add(new VirginFlightAdapter(flight));
        }
        return adaptedResults;
    }
}
