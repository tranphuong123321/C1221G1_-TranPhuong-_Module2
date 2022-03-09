package bai14.bai_tap.colection_review.models;

import java.util.Objects;

public abstract class Candidate {
    private int candidateId;
    private String firstName;
    private String lastName;
    private int birthDay;
    private String address;
    private String numberPhone;
    private String email;
    private int candidateValue;

    public Candidate() {
    }

    public Candidate(int candidateId, String firstName, String lastName, int birthDay, String address, String numberPhone, String email) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.numberPhone = numberPhone;
        this.email = email;
        this.candidateValue = (this instanceof Experience) ? 0 : this instanceof Fresher ? 1 : 2;
//                (candidateType instanceof Experience) ? 0 : (candidateType instanceof  Fresher ? 1 : 2);
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getCandidateValue() {
        return candidateValue;
    }

    public void setCandidateValue(int candidateValue) {
        this.candidateValue = candidateValue;
    }

    @Override
    public String toString() {
        return " id=" + candidateId +
                ", full name=" + firstName + " " + lastName +
                ", birthday=" + birthDay +
                ", address=" + address +
                ", phone=" + numberPhone +
                ", email=" + email +
                ", type=" + candidateValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return candidateId == candidate.candidateId && (firstName + lastName).equals(candidate.firstName + candidate.lastName) && candidateValue == candidate.candidateValue;
    }

}

