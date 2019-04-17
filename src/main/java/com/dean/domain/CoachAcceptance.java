package com.dean.domain;

public class CoachAcceptance {
    private Acceptance acceptance;

    private CoachAcceptance(){}

    private CoachAcceptance(Builder builder){
        this.acceptance=builder.acceptance;
    }
    public static class Builder{

        private Acceptance acceptance;

        public Builder acceptance(Acceptance acceptance){
            this.acceptance=acceptance;
            return this;
        }

        public CoachAcceptance build(){return new CoachAcceptance(this);}

    }
}
