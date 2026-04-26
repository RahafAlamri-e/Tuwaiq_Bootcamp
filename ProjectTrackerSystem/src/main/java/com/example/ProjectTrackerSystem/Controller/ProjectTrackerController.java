package com.example.ProjectTrackerSystem.Controller;

import com.example.ProjectTrackerSystem.ApiResponse.ApiResponse;
import com.example.ProjectTrackerSystem.Model.Project;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/projectTracker")
public class ProjectTrackerController {
    ArrayList<Project> projects = new ArrayList<>();


    @PostMapping("/create")
    public ApiResponse createProject(@RequestBody Project project){
        projects.add(project);
        return new ApiResponse("Project Added Successfully");
    }


    @GetMapping("/get")
    public ArrayList<Project> getProjects(){
        return projects;
    }


    @PutMapping("/update/{id}")
    public ApiResponse updateProject(@PathVariable String id, @RequestBody Project project){
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getID().equalsIgnoreCase(id)) {
                projects.set(i, project);
                return new ApiResponse("Project Updated Successfully");
            }
        }
        return new ApiResponse("Project Not Found");
    }


    @DeleteMapping("/delete/{id}")
    public ApiResponse deleteProject(@PathVariable String id){
        for (Project p : projects) {
            if (p.getID().equalsIgnoreCase(id)) {
                projects.remove(p);
                return new ApiResponse("Project Deleted Successfully");
            }
        }
        return new ApiResponse("Project Not Found");
    }



    @PutMapping("/updateStatus/{id}/{status}")
    public ApiResponse changeProjectStatus(@PathVariable String id, @PathVariable boolean status){
        for (Project p : projects) {
            if (p.getID().equalsIgnoreCase(id)) {
                p.setStatus(status);
                return new ApiResponse("Project Status Updated Successfully");
            }
        }
        return new ApiResponse("Project Not Found");
    }


    @GetMapping("/searchByTitle/{t}")
    public Project searchByTitle(@PathVariable String t){
        for (Project p:projects){
            if (p.getTitle().equalsIgnoreCase(t)){
                return p;
            }
        }
        return null;
    }


    @GetMapping("/searchForCompanyProjectsByName/{companyName}")
    public ArrayList<Project> allProjectForCompany(@PathVariable String companyName){
        ArrayList<Project> allProjects = new ArrayList<>();

        for (Project p : projects){
            if (p.getCompanyName().equalsIgnoreCase(companyName)){
                allProjects.add(p);
            }
        }
        return allProjects;
    }
}
