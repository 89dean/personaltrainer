package com.dean.domain;

public class TrainerAcceptance {
    private Acceptance acceptance;

    private TrainerAcceptance(){}

    private TrainerAcceptance(Builder builder){
        this.acceptance=builder.acceptance;
    }
    public static class Builder{
        private Acceptance acceptance;

        public TrainerAcceptance build(){return new TrainerAcceptance(this);}

    }
}
