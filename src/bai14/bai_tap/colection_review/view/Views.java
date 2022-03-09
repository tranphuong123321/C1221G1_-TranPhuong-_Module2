package bai14.bai_tap.colection_review.view;

import bai14.bai_tap.colection_review.controllers.CandidatesController;

public class Views {

    public static void main(String[] args) {
        CandidatesController candidatesController = new CandidatesController();
        candidatesController.constructorList();
        candidatesController.displayMenu();
    }
}