package model.person;

import java.time.LocalDate;



public class Staff extends Person {
    private double salary;
    private String status;
    private String position;
    private String department;
  

    public Staff(int id, String fullName, String address, String phone, String email, LocalDate dateOfBirth, double salary, String status, String position, String department) {
        super(id, fullName, address, phone, email, dateOfBirth);
        this.salary = Math.max(salary, 0.0);
        this.status = status;
        this.position = position;
        this.department = department;

    }

    public Staff(int id, String fullName, LocalDate dateOfBirth) {
        super(id, fullName, dateOfBirth);
    }

    public double getSalary() { return salary; }
    public String getStatus() { return status; }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }


    public void setSalary(double salary) { this.salary = salary; }
    
    public String setStatus(String status) { return this.status = status; }
    public String setPosition(String position) { return this.position = position; }
    public void setDepartment(String department) { this.department = department; }

  
}
