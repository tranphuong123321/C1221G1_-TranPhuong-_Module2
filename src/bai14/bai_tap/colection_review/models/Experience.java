package bai14.bai_tap.colection_review.models;

public class Experience extends Candidate{
    private double expInYear;
    private String professionalSkill;

    public Experience() {
    }

    public Experience(double expInYear, String professionalSkill) {
        this.expInYear = expInYear;
        this.professionalSkill = professionalSkill;
    }

    public Experience(int candidateId, String firstName, String lastName, int birthDay, String address, String numberPhone, String email, double expInYear, String professionalSkill) {
        super(candidateId, firstName, lastName, birthDay, address, numberPhone, email);
        this.expInYear = expInYear;
        this.professionalSkill = professionalSkill;
    }


    public double getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(double expInYear) {
        this.expInYear = expInYear;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    @Override
    public String toString() {
        return super.toString()+", Experience{" +
                "expInYear=" + expInYear +
                ", professionalSkill='" + professionalSkill + '\'' +
                '}';
    }
}
