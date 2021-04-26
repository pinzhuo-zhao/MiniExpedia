package com.unimelb.swen30006.miniexpedia;

import java.time.LocalDateTime;

/**
 * @program: MiniExpedia
 * @description:
 * @author: Pinzhuo Zhao, StudentID:1043915
 * @create: 2021-04-26 01:06
 **/
public interface FlightAdapter {

    String getDeparture();
    String getDestination();
    LocalDateTime getDepartureTime();

}
