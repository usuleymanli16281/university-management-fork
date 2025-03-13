package service;

import java.util.ArrayList;

import model.Course;
import model.person.Student;


public class StudentService {

    public boolean addCourse(Student student, Course course) {
        if(course == null)
            return false;
        ArrayList<Course> prerequisites = course.getPrerequisites();
        for (Course prerequisite : prerequisites) {
            if (!student.getCourses().contains(prerequisite)) {
            return false; 
        }
        }
        student.getCourses().add(course);
        return true;
    }

    public boolean withdrawFromCourse(Student student, int courseId) {
        return student.getCourses().removeIf(course -> course.getCourseCode() == courseId);
    }

    public double getCGPA(Student student) {
        double sum = 0;
        for (double GPA : student.getGPAs()) {
            sum += GPA;
        }
        return student.getGPAs().size() > 0 ? sum / student.getGPAs().size() : 0.0;
    }
}
