package com.example.Student.Controller;

import com.example.Student.ApiResponse.ApiResponse;
import com.example.Student.Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    ArrayList<Student> students = new ArrayList<>();

    @PostMapping("/create")
    public ApiResponse createStudent(@RequestBody Student student){
        students.add(student);
        return new ApiResponse("Student Created Successfully");
    }

    @GetMapping("/get")
    public ArrayList<Student> displayAllStudents(){
        return students;
    }

    @PutMapping("/update/{id}")
    public ApiResponse updateStudent(@PathVariable String id, @RequestBody Student student){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID().equalsIgnoreCase(id)) {
                students.set(i, student);
                return new ApiResponse("Student Updated Successfully");
            }
        }
        return new ApiResponse("Student Not Found");
    }


    @DeleteMapping("/delete/{id}")
    public ApiResponse deleteStudent(@PathVariable String id){
        for (Student s : students) {
            if (s.getID().equalsIgnoreCase(id)) {
                students.remove(s);
                return new ApiResponse("Student Deleted Successfully");
            }
        }
        return new ApiResponse("Student Not Found");
    }

    @GetMapping("/honors/{id}")
    public ApiResponse classifyStudent(@PathVariable String id){
        for (Student s : students) {
            if (s.getID().equalsIgnoreCase(id)) {
                if (s.getGPA() >= 4.5) {
                    return new ApiResponse("First Honor");
                } else if (s.getGPA() >= 4) {
                    return new ApiResponse("Second Honor");
                } else {
                    return new ApiResponse("No Honor");
                }
            }
        }
        return new ApiResponse("Student Not Found");
    }


    @GetMapping("/above-average")
    public ArrayList<Student> studentsAboveAverageGPA(){
        ArrayList<Student> studentAboveAvg = new ArrayList<>();

        double total = 0;
        for (Student s : students) {
            total += s.getGPA();
        }

        double average = total / students.size();
        for (Student s : students) {
            if (s.getGPA() > average) {
                studentAboveAvg.add(s);
            }
        }

        return studentAboveAvg;
    }


}
