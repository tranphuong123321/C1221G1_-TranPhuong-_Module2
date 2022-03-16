package case_study.models;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String idFacility,
                String nameService,
                double areaUse,
                int rentalPrice,
                int rentalPeopleMax,
                String styleRental,
                String freeServiceIncluded) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
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
        return "Room{" + super.toString() +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
