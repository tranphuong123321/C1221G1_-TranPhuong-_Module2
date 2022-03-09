package bai14.bai_tap.colection_review.models;

public class Fresher extends Candidate {
    private int graduatedDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int graduatedDate, String graduationRank, String education) {
        this.graduatedDate = graduatedDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(int candidateId, String firstName, String lastName, int birthDay, String address, String numberPhone, String email,int graduatedDate, String graduationRank, String education) {
        super(candidateId, firstName, lastName, birthDay, address, numberPhone, email);
        this.graduatedDate = graduatedDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduatedDate() {
        return graduatedDate;
    }

    public void setGraduatedDate(int graduatedDate) {
        this.graduatedDate = graduatedDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString()+", Fresher{" +
                "graduated=" + graduatedDate +
                ", Rank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
