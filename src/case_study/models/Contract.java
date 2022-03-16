package case_study.models;

public class Contract {
    private String idContract;
    private Booking idBooking;
    private String prePayment;
    private String totalPayment;
    private Customer idCustomer;

    public Contract() {
    }

    public Contract(String idContract, Booking idBooking, String prePayment, String totalPayment, Customer idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.prePayment = prePayment;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Booking idBooking) {
        this.idBooking = idBooking;
    }

    public String getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(String prePayment) {
        this.prePayment = prePayment;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking=" + idBooking +
                ", prePayment='" + prePayment + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                ", idCustomer=" + idCustomer +
                '}';
    }
}