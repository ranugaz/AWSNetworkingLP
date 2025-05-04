package com.awslearning.services;

import com.awslearning.models.Course;
import com.awslearning.repositories.CourseRepository;
import com.awslearning.exceptions.CourseNotFoundException;
import com.awslearning.exceptions.ValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CourseServiceTest {
    @Mock
    private CourseRepository courseRepository;

    private CourseService courseService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        courseService = new CourseService(courseRepository);
    }

    @Test
    void createCourse_ValidCourse_ReturnsCourse() {
        // Arrange
        Course course = new Course("C001", "Test Course", "Description");
        when(courseRepository.save(any(Course.class))).thenReturn(course);

        // Act
        Course result = courseService.createCourse(course);

        // Assert
        assertNotNull(result);
        assertEquals("Test Course", result.getTitle());
        verify(courseRepository).save(course);
    }

    @Test
    void createCourse_EmptyTitle_ThrowsValidationException() {
        // Arrange
        Course course = new Course("C001", "", "Description");

        // Act & Assert
        assertThrows(ValidationException.class, () -> courseService.createCourse(course));
    }

    @Test
    void getCourse_ExistingId_ReturnsCourse() {
        // Arrange
        Course course = new Course("C001", "Test Course", "Description");
        when(courseRepository.findById("C001")).thenReturn(Optional.of(course));

        // Act
        Course result = courseService.getCourse("C001");

        // Assert
        assertNotNull(result);
        assertEquals("C001", result.getCourseId());
    }

    @Test
    void getCourse_NonExistingId_ThrowsCourseNotFoundException() {
        // Arrange
        when(courseRepository.findById("C001")).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(CourseNotFoundException.class, () -> courseService.getCourse("C001"));
    }

    @Test
    void getAllCourses_ReturnsListOfCourses() {
        // Arrange
        List<Course> courses = Arrays.asList(
                new Course("C001", "Course 1", "Description 1"),
                new Course("C002", "Course 2", "Description 2")
        );
        when(courseRepository.findAll()).thenReturn(courses);

        // Act
        List<Course> result = courseService.getAllCourses();

        // Assert
        assertEquals(2, result.size());
        verify(courseRepository).findAll();
    }

    @Test
    void updateCourse_ExistingCourse_ReturnsCourse() {
        // Arrange
        Course course = new Course("C001", "Updated Course", "New Description");
        when(courseRepository.exists("C001")).thenReturn(true);
        when(courseRepository.save(any(Course.class))).thenReturn(course);

        // Act
        Course result = courseService.updateCourse("C001", course);

        // Assert
        assertNotNull(result);
        assertEquals("Updated Course", result.getTitle());
        verify(courseRepository).save(course);
    }

    @Test
    void deleteCourse_ExistingCourse_DeletesSuccessfully() {
        // Arrange
        when(courseRepository.exists("C001")).thenReturn(true);

        // Act
        courseService.deleteCourse("C001");

        // Assert
        verify(courseRepository).delete("C001");
    }
}