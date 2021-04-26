/**
 * This class is created for Workshop's exercises in the subject SWEN30006 Software Design and Modelling at The University of Melbourne .
 * @author 	Patanamon Thongtanunam
 * @version 1.0
 * @since 	2019-04-20
 *
 */

package com.unimelb.swen30006.miniexpedia;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class miniExpedia {

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        boolean stopInput = false;
        String[] airlines = {"Jetstar","Qantas","Virgin"};


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd&HH:mm");
        System.out.print("Number of Passengers: ");
        int numPassengers = in.nextInt();

        System.out.print("Preferred airline? (0: All, 1: Jetstar, 2: Qantas, 3: Virgin)");
        int airlineIndex = in.nextInt();
        ArrayList<FlightAdapter> flights = new ArrayList<>();
        while(!stopInput) {
            System.out.print("Date & Time (ex. 2019-04-29&10:00): ");
            String dateStr = in.next();

            LocalDateTime date = null;
            //Check date
            try {
                date = LocalDateTime.parse(dateStr,formatter);
            }catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Wrong Date & Time Format.");
                continue;
            }

            System.out.print("Departure airport: ");
            String departure = in.next();
            System.out.print("Destination airport: ");
            String destination = in.next();


            System.out.print("More flight? (y/n): ");
            String input = in.next();
            input = input.toLowerCase();
            stopInput = input.equals("n");
            System.out.println(stopInput);
            FlightAdapter flight = null;
            if (airlineIndex == 2) {
                flight = new QantasFlightAdapter(departure, date, destination);
            }else if (airlineIndex == 3) {
                flight = new VirginFlightAdapter(departure, date, destination);
            }
            flights.add(flight);
        }


        in.close();

        SearchFactory factory = SearchFactory.getInstance();
        SearchAdapter adapter = factory.getAdapter(airlineIndex);
        ArrayList<FlightAdapter> adaptedResults = adapter.search(flights, numPassengers);
  
        for (FlightAdapter result: adaptedResults) {
            System.out.println("Departure: "+ result.getDeparture() + "\n" + "Departure Time: "+ result.getDepartureTime() +
                    "\n" + "Destination: " + result.getDestination());
        }
    }



}
