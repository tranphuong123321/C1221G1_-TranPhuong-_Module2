package case_study.models;

public class Constract {
    //Số hợp đồng, mã booking, Số tiền cọc trước, Tổng số tiền thanh toán, mã khách hàng
    private int numberConstract;
    private int idBooking;
    private int deposit;
    private int totalPaymentAmount;
    private int idCustomer;

    public Constract() {
    }

    public Constract(int numberConstract, int idBooking, int deposit, int totalPaymentAmount, int idCustomer) {
        this.numberConstract = numberConstract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPaymentAmount = totalPaymentAmount;
        this.idCustomer = idCustomer;
    }

    public int getNumberConstract() {
        return numberConstract;
    }

    public void setNumberConstract(int numberConstract) {
        this.numberConstract = numberConstract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(int totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Constract{" +
                "numberConstract=" + numberConstract +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", totalPaymentAmount=" + totalPaymentAmount +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
