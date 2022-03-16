package case_study.models;

public class House extends Facility{
    public String roomStandard; // tieu chuan phong
    public int numberOfFloors; // so tang

    public House() {
    }

    public House(String idFacility,
                 String nameService,
                 double areaUse,
                 int rentalPrice,
                 int rentalPeopleMax,
                 String styleRental,
                 String roomStandard,
                 int numberOfFloors) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
