package case_study.models;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String id,
                    String name,
                    String age,
                    String sex,
                    String idCard,
                    String numBerPhone,
                    String email,
                    String typeCustomer,
                    String address) {
        super(id, name, age, sex, idCard, numBerPhone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "customer{" + super.toString() +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
