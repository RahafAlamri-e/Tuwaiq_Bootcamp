package com.example.eventSystem.Controller;

import com.example.eventSystem.ApiResponse.ApiResponse;
import com.example.eventSystem.Model.Event;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/event")
public class EventSystemController {
    ArrayList<Event> events = new ArrayList<>();

    @PostMapping("/create")
    public ApiResponse createEvent(@RequestBody Event event){
        events.add(event);
        return new ApiResponse("Event Added Successfully");
    }


    @GetMapping("/get")
    public ArrayList<Event> getEvents(){
        return events;
    }


    @PutMapping("/update/{id}")
    public ApiResponse updateEvent(@PathVariable String id, @RequestBody Event event){
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getID().equalsIgnoreCase(id)) {
                events.set(i, event);
                return new ApiResponse("Event Updated Successfully");
            }
        }
        return new ApiResponse("Event Not Found");
    }


    @DeleteMapping("/delete/{id}")
    public ApiResponse deleteEvent(@PathVariable String id){
        for (Event e : events) {
            if (e.getID().equalsIgnoreCase(id)) {
                events.remove(e);
                return new ApiResponse("Event Deleted Successfully");
            }
        }
        return new ApiResponse("Event Not Found");
    }



    @PutMapping("/updateCapacity/{id}/{capacity}")
    public ApiResponse changeCapacity(@PathVariable String id, @PathVariable int capacity){
        for (Event e : events) {
            if (e.getID().equalsIgnoreCase(id)) {
                e.setCapacity(capacity);
                return new ApiResponse("Event Capacity Updated Successfully");
            }
        }
        return new ApiResponse("Event Not Found");
    }



    @GetMapping("/searchById/{id}")
    public Event searchById(@PathVariable String id){
        for (Event e:events){
            if (e.getID().equalsIgnoreCase(id)){
                return e;
            }
        }
        return null;
    }
}
