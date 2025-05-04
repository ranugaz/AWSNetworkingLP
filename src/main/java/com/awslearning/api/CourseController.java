package com.awslearning.api;

import com.awslearning.models.Course;
import com.awslearning.services.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Course Management", description = "Operations pertaining to courses in the Learning Platform")
@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @ApiOperation(value = "View a list of available courses",
            notes = "Returns all courses in the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list of courses"),
            @ApiResponse(code = 404, message = "No courses available")
    })
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(courseService.getAllCourses());
    }

    @ApiOperation(value = "Get a course by Id",
            notes = "Provides detailed information about a specific course")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved course"),
            @ApiResponse(code = 404, message = "Course not found with provided ID")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable String id) {
        return ResponseEntity.ok(courseService.getCourse(id));
    }

    @ApiOperation(value = "Add a new course",
            notes = "Creates a new course in the system")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Course successfully created"),
            @ApiResponse(code = 400, message = "Invalid input"),
            @ApiResponse(code = 409, message = "Course already exists")
    })
    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        return ResponseEntity.ok(courseService.createCourse(course));
    }

    @ApiOperation(value = "Update an existing course",
            notes = "Updates the information of an existing course")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Course successfully updated"),
            @ApiResponse(code = 404, message = "Course not found with provided ID"),
            @ApiResponse(code = 400, message = "Invalid input")
    })
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable String id,
                                               @RequestBody Course course) {
        return ResponseEntity.ok(courseService.updateCourse(id, course));
    }

    @ApiOperation(value = "Delete a course",
            notes = "Removes a course from the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Course successfully deleted"),
            @ApiResponse(code = 404, message = "Course not found with provided ID")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
        return ResponseEntity.ok().build();
    }
}