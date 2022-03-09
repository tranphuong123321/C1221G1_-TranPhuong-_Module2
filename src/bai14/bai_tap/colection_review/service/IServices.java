package bai14.bai_tap.colection_review.service;

import bai14.bai_tap.colection_review.models.Candidate;


import java.util.List;

public interface IServices {
    void add(Candidate candidate);
    List<Candidate> searching(String string);
}
