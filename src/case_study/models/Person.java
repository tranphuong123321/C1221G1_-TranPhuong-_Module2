package case_study.models;

public abstract class Person {
    private String id;
    private String name;
    private String age;
    private String sex;
    private String idCard;
    private String numBerPhone;
    private String email;

    public Person() {

    }

    public Person(String id, String name, String age, String sex, String idCard, String numBerPhone, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idCard = idCard;
        this.numBerPhone = numBerPhone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumBerPhone() {
        return numBerPhone;
    }

    public void setNumBerPhone(String numBerPhone) {
        this.numBerPhone = numBerPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", numBerPhone='" + numBerPhone + '\'' +
                ", email='" + email + '\'';
    }
}
