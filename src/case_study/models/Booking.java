package case_study.models;

public class Booking extends Facility {
    private Integer idBooking;
    private String startDate;
    private String enDate;
    private Customer customer;
    private Facility facility;

    public Booking() {

    }

    public Booking(Integer idBooking, String startDate, String enDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.enDate = enDate;
        this.customer = customer;
        this.facility = facility;
    }

    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEnDate() {
        return enDate;
    }

    public void setEnDate(String enDate) {
        this.enDate = enDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" + super.toString() +
                "idBooking=" + idBooking +
                ", startDate='" + startDate + '\'' +
                ", enDate='" + enDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}
