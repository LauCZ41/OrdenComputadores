package model;

public class Computer implements Comparable<Computer> {
    private String brand;
    private int ram;
    private int processsors;
    private double processingSpeed;
    private char operatingSystem;

    public Computer(String brand, int ram, int processsors, double processingSpeed, char operatingSystem) {
        this.brand = brand;
        this.ram = ram;
        this.processsors = processsors;
        this.processingSpeed = processingSpeed;
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getProcesssors() {
        return processsors;
    }

    public void setProcesssors(int processsors) {
        this.processsors = processsors;
    }

    public double getProcessingSpeed() {
        return processingSpeed;
    }

    public void setProcessingSpeed(double processingSpeed) {
        this.processingSpeed = processingSpeed;
    }

    public char getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(char operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public int compareTo(Computer otherComputer) {
        return Double.compare(this.processingSpeed, otherComputer.getProcessingSpeed());
    }
}