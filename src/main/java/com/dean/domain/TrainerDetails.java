package com.dean.domain;

public class TrainerDetails {
    private UpdateUserDetails updateUserDetails;


    private TrainerDetails(){}

    private TrainerDetails(Builder builder){
        this.updateUserDetails=builder.updateUserDetails;
    }
    public static class Builder{

        private UpdateUserDetails updateUserDetails;

        public Builder loginDetails(UpdateUserDetails updateUserDetails){
            this.updateUserDetails=updateUserDetails;
            return this;
        }

        public TrainerDetails build(){return new TrainerDetails(this);}

    }

}
