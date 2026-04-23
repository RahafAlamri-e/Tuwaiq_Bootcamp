package com.example.TaskTrakerSystem.Controller;

import com.example.TaskTrakerSystem.ApiResponse.ApiResponse;
import com.example.TaskTrakerSystem.Model.TaskTrackerSystem;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/taskTracker")
public class TaskTrackerSystemController {
    ArrayList<TaskTrackerSystem> task = new ArrayList<>();


    @PostMapping("/addTask")
    public ApiResponse addTask(@RequestBody TaskTrackerSystem taskTracker){
        task.add(taskTracker);
        return new ApiResponse("Task added successfully");
    }

    @GetMapping("/get")
    public ArrayList<TaskTrackerSystem> getTask(){
        return task;
    }

    @PutMapping("/updateTask/{index}")
    public ApiResponse updateTask(@PathVariable int index,@RequestBody TaskTrackerSystem trackerSystem){
        task.set(index, trackerSystem);
        return new ApiResponse("Task updated successfully");
    }

    @DeleteMapping("/deleteTask/{index}")
    public ApiResponse deleteTask(@PathVariable int index){
        task.remove(index);
        return new ApiResponse("Task deleted successfully");
    }

    @PutMapping("/updateStatus/{index}/{status}")
    public ApiResponse updateStatus(@PathVariable int index,@PathVariable boolean status){
        task.get(index).setStatus(status);
        return new ApiResponse("Task status updated successfully");
    }

    @GetMapping("/searchByTitle/{title}")
    public TaskTrackerSystem searchByTitle(@PathVariable String title){
        for (TaskTrackerSystem t: task){
            if (t.getTitle().equalsIgnoreCase(title)){
                return t;
            }
        }
        return null;
    }

}
