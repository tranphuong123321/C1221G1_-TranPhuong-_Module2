package case_study.models;

public class Villa extends Facility{
    private String standardVilla;
    private double arePool;
    private int floor;

    public Villa() {
    }


    public Villa(String idFacility,
                 String nameService,
                 double areaUse,
                 int rentalPrice,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardVilla,
                 double arePool,
                 int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.arePool = arePool;
        this.floor = floor;

    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getArePool() {
        return arePool;
    }

    public void setArePool(double arePool) {
        this.arePool = arePool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardVilla='" + standardVilla + '\'' +
                ", arePool=" + arePool +
                ", floor=" + floor +
                '}';
    }
}
