package com.frankmoley.business.reservation;

import com.frankmoley.business.reservation.client.RoomService;
import com.frankmoley.business.reservation.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomReservationController {

    private final RoomService roomService;

    @Autowired
    public RoomReservationController(RoomService roomService) {
        this.roomService = roomService;
    }

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms() {
        return this.roomService.findAll(null);
    }

//    private final RestTemplate restTemplate;
//
//    @Autowired
//    public RoomReservationController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

//    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
//    public List<Room> getAllRooms() {
//        ResponseEntity<List<Room>> roomsResponse = this.restTemplate.exchange(
//                "http://ROOMSERVICES/rooms", HttpMethod.GET, null,
//                new ParameterizedTypeReference<List<Room>>() {
//                });
//        return roomsResponse.getBody();
//    }
}
