package service;

import model.Course;
import model.person.Student;
import model.person.Faculty;

import java.util.ArrayList;

public class CourseService {

    public boolean addStudentToCourse(Course course, Student student) {
        if (course != null && student != null) {
            ArrayList<Student> students = course.getStudents();
            if (!students.contains(student)) {
                students.add(student);
                return true;
            }
        }
        return false;
    }

    public boolean removeStudentFromCourse(Course course, Student student) {
        if (course != null && student != null) {
            ArrayList<Student> students = course.getStudents();
            return students.remove(student);
        }
        return false;
    }

    public boolean addPrerequisite(Course course, Course prerequisite) {
        if (course != null && prerequisite != null) {
            ArrayList<Course> prerequisites = course.getPrerequisites();
            if (!prerequisites.contains(prerequisite)) {
                prerequisites.add(prerequisite);
                return true;
            }
        }
        return false;
    }

    public boolean removePrerequisite(Course course, Course prerequisite) {
        if (course != null && prerequisite != null) {
            ArrayList<Course> prerequisites = course.getPrerequisites();
            return prerequisites.remove(prerequisite);
        }
        return false;
    }

    public void assignTeacherToCourse(Course course, Faculty teacher) {
        if (course != null && teacher != null) {
            course.setTeacher(teacher);
        }
    }

    public void updateCourseDetails(Course course, String title, String description, int credits, int CRN, char passingGrade) {
        if (course != null) {
            course.setTitle(title);
            course.setDescription(description);
            course.setCredits(credits);
            course.setCRN(CRN);
            course.setPassingGrade(passingGrade);
        }
    }

}
