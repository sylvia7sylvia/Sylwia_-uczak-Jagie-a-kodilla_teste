package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be served by aur airlines.");
        } finally {
            System.out.println("Thank you for using Kodilla Airlines.");
        }
    }
}
