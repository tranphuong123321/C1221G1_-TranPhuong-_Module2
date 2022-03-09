package bai14.bai_tap.colection_review.controllers;


import bai14.bai_tap.colection_review.models.*;
import bai14.bai_tap.colection_review.service.impl.CandidatesServicesImpl;
import java.util.*;

public class CandidatesController {
    CandidatesServicesImpl candidatesServices = new CandidatesServicesImpl();
    Scanner sc = new Scanner(System.in);
    List<Rank> ranks = candidatesServices.newRank();

    public void displayMenu() {
        int choice;
        do {
            System.out.println("CANDIDATES MANAGEMENT SYSTEM\n" +
                    "\t1.Experience\n" +
                    "\t2.Fresher\n" +
                    "\t3.Internship\n" +
                    "\t4.Searching\n" +
                    "\t5.Display all candidates\n" +
                    "\t6.Exit\n");
            System.out.println(("Please choose 1 to Create Experience Candidate, 2 to Create Fresher candidate" +
                    ", 3 to Internship Candidate" +
                    ", 4 to Searching,\n 5 to Display All Candidates and 6 to Exit Program"));
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    input(choice);
                    break;
                case 4:
                    System.out.println("Enter name to search");
                    String search = sc.nextLine();
                    List<Candidate> result = candidatesServices.searching(search);
                    if (result.size() == 0) {
                        System.out.println("=====/ No result /=====");
                    } else {
                        System.out.println("=====~ Searching result: ~=====");
                        candidatesServices.displayCandidate(result);
                    }
                    break;
                case 5:
                    List<Candidate> listCandidate = candidatesServices.getCandidates();
                    candidatesServices.displayCandidate(listCandidate);

                    break;
                default:
                    System.out.println("Not exist your choice in this program");
            }
        } while (choice != 6);

    }

    public void input(int index) {
        System.out.println("Enter candidates id number");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter candidate first name");
        String firstName = sc.nextLine();
        System.out.println("Enter candidate last name");
        String lastName = sc.nextLine();

        int dayOfBirth;

        int currentYear = new Date().getYear();
        do {
            System.out.println(currentYear);
            System.out.println("Enter candidate birthday");
            dayOfBirth = Integer.parseInt(sc.nextLine());

        } while (dayOfBirth < 1900 || dayOfBirth > (currentYear + 1900));
        System.out.println("Enter candidate address");
        String address = sc.nextLine();
        String phone;
        do {
            System.out.println("Enter candidate phone number (10  nums)");
            phone = sc.nextLine();
        } while (phone.length() != 10);

        System.out.println("Enter candidate email");
        String email = sc.nextLine();

        switch (index) {
            case 1:
                double experienceYear;
                do {
                    System.out.println("Enter candidate year of experience (0-100 years)");
                    experienceYear = Double.parseDouble(sc.nextLine());
                } while (experienceYear < 0 || experienceYear > 100);

                System.out.println("Enter candidate professional skills");
                String skills = sc.nextLine();

                Experience experience = new Experience(id, firstName, lastName, dayOfBirth, address, phone, email, experienceYear, skills);

                candidatesServices.add(experience);
                break;
            case 2:
                System.out.println("Enter candidate graduated time");
                int graduatedTime = Integer.parseInt(sc.nextLine());
                String rank;

                do {
                    System.out.println("Enter candidate rank of graduation");
                    for (Rank value : ranks) {
                        System.out.println(value);
                    }
                    rank = sc.nextLine();

                    for (Rank value : ranks) {
                        if (value.getRankName().equals(rank.toLowerCase())) {
                            rank = value.getRankName();
                        }
                    }
                    ;
                } while (!ranks.contains(new Rank(rank)));

                System.out.println("Enter candidate university where student graduated");
                String education = sc.nextLine();
                Fresher fresher = new Fresher(id, firstName, lastName, dayOfBirth, address, phone, email, graduatedTime, rank, education);

                candidatesServices.add(fresher);
                break;
            case 3:
                System.out.println("Enter candidate majors");
                String major = sc.nextLine();
                System.out.println("Enter candidate semester");
                int semester = Integer.parseInt(sc.nextLine());
                System.out.println("Enter candidate university name");
                String universityName = sc.nextLine();
                Intern intern = new Intern(id, firstName, lastName, dayOfBirth, address, phone, email, major, semester, universityName);

                candidatesServices.add(intern);
                break;
        }
        System.out.println("Do you want continue(Y/N)?");
        String answers = sc.nextLine();
        if ("Y".equals(answers)) {
            System.out.println("1. Experience\n" +
                    "2. Fresher\n" +
                    "3. Internship\n");

            int newChoice = -1;
            while (newChoice < 1 || newChoice > 3) {
                System.out.print("Your choice: ");
                newChoice = Integer.parseInt(sc.nextLine());
            }
            input(newChoice);
        } else if ("N".equals(answers)) {
            displayMenu();
        } else {
            throw new InputMismatchException("Không đúng định dạng, hệ thống tự động quay lại menu chính");
        }
    }


    public void constructorList() {

        Experience experience = new Experience(1, "Tran", "Phuong", 1994, "Đà Nẵng", "0762789883", "phuong2010@gmail.com", 2.5, "Java developer");
        Experience experience1 = new Experience(2, "Nguyen", "Hung", 1994, "Đà Nẵng", "0927098763", "hungnguyen@gmail.com", 2.5, "English Professional");

        Fresher fresher = new Fresher(3, "Nguyen Van", "Hoa", 2001, "Đà Nẵng", "0762789883", "hoanguyen@gmail.com", 2022, "Excellent", "DTU");
        Fresher fresher1 = new Fresher(4, "Ha Thi", "Duyen", 2001, "Đà Nẵng", "0762789883", "duyennguyen@gmail.com", 2023, "Excellent", "Chinese Language DTU");

        Intern intern = new Intern(5, "Tran", "Quang", 2001, "Đà Nẵng", "0762789883", "quangtran@gmail.com", "Java developer", 2022, "Codegym");
        Intern intern1 = new Intern(6, "Nguyễn Thị Mỹ", "Duyên", 2001, "Đà Nẵng", "0762789883", "nguyenthimyduyen@gmail.com", "Java developer", 2022, "Codegym");


        candidatesServices.add(experience);
        candidatesServices.add(experience1);

        candidatesServices.add(fresher);
        candidatesServices.add(fresher1);

        candidatesServices.add(intern);
        candidatesServices.add(intern1);

    }
}

