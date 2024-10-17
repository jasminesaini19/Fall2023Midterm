/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**
 * This class prints the names of the days using enums.
 * 
 * @author sivagamasrinivasan
 */
public class Days {

    public static void main(String[] args) {
        // Print all the days of the week using the Day enum
        for (Day day : Day.values()) {
            System.out.println(day.getDayName());
        }
    }
}

/**
 * Enum to represent the days of the week.
 */
enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String dayName;

    // Constructor for the enum
    Day(String dayName) {
        this.dayName = dayName;
    }

    // Method to get the day name
    public String getDayName() {
        return dayName;
    }
}