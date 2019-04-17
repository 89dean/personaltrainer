package com.dean.domain;

public class GymMemberCancelation {
    private Cancelation cancelation;

    private GymMemberCancelation(){}

    private GymMemberCancelation(Builder builder){
        this.cancelation=builder.cancelation;
    }
    public static class Builder{

        private Cancelation cancelation;

        public Builder cancelation(Cancelation cancelation){
            this.cancelation=cancelation;
            return this;
        }

        public GymMemberCancelation build(){return new GymMemberCancelation(this);}

    }
}
