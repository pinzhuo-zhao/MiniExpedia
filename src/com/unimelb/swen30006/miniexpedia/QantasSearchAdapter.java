package com.unimelb.swen30006.miniexpedia;

import com.unimelb.swen30006.Qantas.QantasFlight;
import com.unimelb.swen30006.Qantas.QantasSearch;

import java.util.ArrayList;

/**
 * @program: MiniExpedia
 * @description:
 * @author: Pinzhuo Zhao, StudentID:1043915
 * @create: 2021-04-26 01:08
 **/
public class QantasSearchAdapter implements SearchAdapter {
    QantasSearch qantasSearch = new QantasSearch();


    @Override
    public ArrayList<FlightAdapter> search(ArrayList<FlightAdapter> flights, int numPassengers) {
        ArrayList<QantasFlight> qantasFlights = new ArrayList<>();
        for (FlightAdapter flight :flights){
            if (flight instanceof QantasFlight){
                qantasFlights.add((QantasFlight)flight);
            }
        }
        ArrayList<QantasFlight> results = qantasSearch.search(qantasFlights, numPassengers);
        ArrayList<FlightAdapter> adaptedResults = new ArrayList();
        for (QantasFlight result : results) {
            adaptedResults.add(new QantasFlightAdapter(result));
        }
        return adaptedResults;
    }
}
