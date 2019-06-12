package com.company;

import java.util.Scanner;

public class Converters {
    private void showChoise() {
        System.out.println("1 from Millimeters To Meters" +
                "\n2 from Meters To Millmeters" +
                "\n3 from Meters To Millmeters" +
                "\n4 from Millimeters T Kilometers" +
                "\n5 from Kilometers To Millimeters" +
                "\n6 from Kilometers To Mile" +
                "\n7 from Mile To Kilometers" +
                "\n8 from Decimeters T oKilometers" +
                "\n9 from Yard To Meters" +
                "\n10 from Meter To Yard");
    }
    //millimetr and meter
    public double fromMillimetersToMeters(double mil) {
        return mil / 1000;
    }
    public double fromMetersToMillmeters(double metr) {
        return metr * 1000;
    }

    //millimeter and kilometer
    public double fromMillimetersToKilometers(double mil) {
        return mil / 10000;
    }
    public double fromKilometersToMillimeters(double klm) {
        return klm * 10000;
    }

    //kilometer and mile
    public double fromKilometersToMile(double klm) {
        return klm / 0.621371;
    }
    public double fromMileToKilometers(double mile) {
        return mile * 1.60934;
    }

    //kilometer and decimeter
    public double fromKilometersToDecimeters(double klm) {
        return klm / 100;
    }
    public double fromDecimetersToKilometers(double dcm) {
        return dcm * 100;
    }

    //meter and yard
    public double fromYardToMeters(double metr) {
        return metr / 0.9144;
    }
    public double fromMeterToYard(double yard) {
        return yard * 1.09361;
    }

    public double Convert() {
        showChoise();
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1":
                return fromMillimetersToMeters(Double.parseDouble(scanner.nextLine()));
            case "2":
                fromMetersToMillmeters(Double.parseDouble(scanner.nextLine()));
            case "3":
                return fromMillimetersToKilometers(Double.parseDouble(scanner.nextLine()));
            case "4":
                return fromKilometersToMillimeters(Double.parseDouble(scanner.nextLine()));
            case "5":
                return fromKilometersToMile(Double.parseDouble(scanner.nextLine()));
            case "6":
                return fromMileToKilometers(Double.parseDouble(scanner.nextLine()));
            case "7":
                return fromKilometersToDecimeters(Double.parseDouble(scanner.nextLine()));
            case "8":
                return fromDecimetersToKilometers(Double.parseDouble(scanner.nextLine()));
            case "9":
                return fromYardToMeters(Double.parseDouble(scanner.nextLine()));
            case "10":
                return fromMeterToYard(Double.parseDouble(scanner.nextLine()));
            default:
                System.out.println("incorrect operation");
                return Double.NaN;
        }
    }
}
