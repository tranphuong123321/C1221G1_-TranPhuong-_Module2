package bai14.bai_tap.colection_review.models;

public class Intern extends Candidate{
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(int candidateId, String firstName, String lastName, int birthDay, String address, String numberPhone, String email, String majors, int semester, String universityName) {
        super(candidateId, firstName, lastName, birthDay, address, numberPhone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString()+", Intern{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", university='" + universityName + '\'' +
                '}';
    }
}
