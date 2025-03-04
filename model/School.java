package model;

import java.util.List;

public class School {
    private String name;
    private List<Building> buildings;
    private List<Department> departments;

    public School(String name, List<Building> buildings, List<Department> departments) {
        this.name = name;
        this.buildings = buildings;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School{name='").append(name).append("', ")
          .append("buildings=").append(buildings).append(", ")
          .append("departments=").append(departments).append("}");
        return sb.toString();
    }
}
