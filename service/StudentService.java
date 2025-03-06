package service;

import model.person.Student;
import model.Course;


public class StudentService {

    public boolean addCourse(Student student, Course course) {
        if (course != null) {
            student.getCourses().add(course);
            return true;
        }
        return false;
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
