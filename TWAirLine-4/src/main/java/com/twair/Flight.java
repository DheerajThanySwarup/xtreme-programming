package com.twair;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {
    private String source;
    private String destination;
    private Plane plane;
    private String number;
    private Integer availableSeats;
    private Calendar departureTime;
    private Calendar arrivalTime;
    private Map<ClassType, TravelClass> travelClassMap = new HashMap<>();
    private Double price;
    private  Integer totalSeats;

    public Flight(String number, String source, String destination, Plane plane, Calendar departure, Calendar arrival, List<TravelClass> travelClasses) throws Exception {
        this.source = source;
        this.destination = destination;
        this.plane = plane;
        this.number = number;
        this.totalSeats = plane.getNumberOfSeats();
        setScheduleTime(departure, arrival);
        for(TravelClass travelClass : travelClasses) {
            travelClassMap.put(travelClass.getClassType(), travelClass);
        }
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public boolean canBook(ClassType classType, Integer numberOfSeats) {
        if(travelClassMap.containsKey(classType)) {
            return travelClassMap.get(classType).canBook(numberOfSeats);
        }
        return false;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getNumber() {
        return number;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public Calendar getArrivalTime() {
        return arrivalTime;
    }

    public boolean hasClass(ClassType classType) {
        return travelClassMap.containsKey(classType);
    }

    private void setScheduleTime(Calendar departureTime, Calendar arrivalTime) throws Exception {
        if(departureTime.after(arrivalTime)) {
            throw new Exception("departure time cannot be greater than arrival time");
        }
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public double getPrice(ClassType classType, int noOfSeats) {
        if(travelClassMap.containsKey(classType)) {
            return travelClassMap.get(classType).getBasePrice()*noOfSeats;
        }
        return 0;

    }

    public double getFair(ClassType classType, int noOfSeats) {
        if(travelClassMap.containsKey(classType)) {
            availableSeats = travelClassMap.get(classType).getOccupiedSeats();
            totalSeats = travelClassMap.get(classType).getTotalSeats();
            Integer percentage = calculatePercentage(availableSeats+noOfSeats, totalSeats);
            Double basePrice = travelClassMap.get(classType).getBasePrice();
            return applyFilter(percentage, noOfSeats,basePrice );
        }
    }

    private double applyFilter(Integer percentage, int noOfSeats, Double basePrice) {
        if (percentage < 41) {
            return calculateFair(noOfSeats, basePrice, 0);
        }
        else if (percentage < 91) {
            return calculateFair(noOfSeats, basePrice, 30);
        }
        else
            return calculateFair(noOfSeats, basePrice, 60);

    }

    private double calculateFair(int noOfSeats, Double basePrice, int hikePercentage) {
        double hikeAmount = (hikePercentage/basePrice)*100;
        return hikeAmount*noOfSeats;
    }

    private Integer calculatePercentage(Integer availableSeats, Integer totalSeats) {
        return (availableSeats/totalSeats)*100;
    }
}
