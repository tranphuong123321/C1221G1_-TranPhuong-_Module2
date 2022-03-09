package bai14.bai_tap.colection_review.service.impl;

import bai14.bai_tap.colection_review.models.Candidate;
import bai14.bai_tap.colection_review.models.Rank;
import bai14.bai_tap.colection_review.service.IServices;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidatesServicesImpl implements IServices {
    private List<Candidate> candidates = new ArrayList<>();

    Scanner sc =  new Scanner(System.in);

    public CandidatesServicesImpl() {
    }

    public CandidatesServicesImpl(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }


    @Override
    public void add(Candidate candidate) {
        if(!candidates.contains(candidate)){
            candidates.add(candidate);
        }else{
            System.out.println("Exist!, Did you want to change this candidate value? (Y/N)");
            String check = sc.nextLine();
            if("Y".equals(check)){
                candidates.set(candidates.indexOf(candidate),candidate);
            }else if("N".equals(check)){
                System.out.println("Your change has been cancelled");
            }else{
                System.out.println("Not correct format");
            }
        }
    }

    @Override
    public List<Candidate> searching(String string) {
        List<Candidate> searchingResult = new ArrayList<>();

        for (Candidate candidate : candidates
        ) {
            if (candidate.getFirstName().toLowerCase().contains(string.toLowerCase()) || candidate.getLastName().toLowerCase().contains(string.toLowerCase())) {
                searchingResult.add(candidate);
            }
        }

        return searchingResult;
    }

    public List<Rank> newRank() {
        List<Rank> ranks = new ArrayList<>();
        ranks.add(new Rank("Excellent"));
        ranks.add(new Rank("Good"));
        ranks.add(new Rank("Fair"));
        ranks.add(new Rank("Poor"));
        return ranks;
    }

    public void displayCandidate(List<Candidate> candidates){
        System.out.println("=====# Experience Candidate #=====");
        candidates.forEach(candidate ->
                {
                    if (candidate.getCandidateValue() == 0) {
                        System.out.println(candidate);
                    }
                }
        );

        System.out.println("=====# Fresher Candidate #=====");
        candidates.forEach(candidate ->
                {
                    if (candidate.getCandidateValue() == 1) {
                        System.out.println(candidate);
                    }
                }
        );

        System.out.println("=====# Internship Candidate #=====");
        candidates.forEach(candidate ->
                {
                    if (candidate.getCandidateValue() == 2) {
                        System.out.println(candidate);
                    }
                }
        );
    }
}
