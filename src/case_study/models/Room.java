package case_study.models;

public class Room extends Facility{
private  String freeServiceIncluded;

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceName, int usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumNumberOfPeople=" + getMaximumNumberOfPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
