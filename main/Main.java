package main;


import java.time.LocalDate;

import model.person.Staff;






public class Main {
    public static void main(String[] args) {
        Staff staff1 = new Staff(-1,"as",LocalDate.now());
        System.out.println(staff1);
    }
}
