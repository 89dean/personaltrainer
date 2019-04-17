package com.dean.domain;

public class CoachDetails {
    private UpdateUserDetails updateUserDetails;


    private CoachDetails(){}

    private CoachDetails(Builder builder){
        this.updateUserDetails=builder.updateUserDetails;
    }
    public static class Builder{

        private UpdateUserDetails updateUserDetails;

        public Builder loginDetails(UpdateUserDetails updateUserDetails){
            this.updateUserDetails=updateUserDetails;
            return this;
        }

        public CoachDetails build(){return new CoachDetails(this);}

    }
}
