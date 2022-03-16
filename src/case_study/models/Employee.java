package case_study.models;

import java.io.Serializable;

public class Employee extends Person implements Serializable {

    private String level;
    private String position;
    private String salary;

    public Employee() {

    }


    public Employee(String id,
                    String name,
                    String age,
                    String sex,
                    String idCard,
                    String numBerPhone,
                    String email,
                    String level,
                    String position,
                    String salary) {
        super(id, name, age, sex, idCard, numBerPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

}
