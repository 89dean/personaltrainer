package com.dean.domain;

public class GymMemberDetails {
    private UpdateUserDetails updateUserDetails;


    private GymMemberDetails(){}

    private GymMemberDetails(Builder builder){
        this.updateUserDetails=builder.updateUserDetails;
    }
    public static class Builder{

        private UpdateUserDetails updateUserDetails;

        public Builder loginDetails(UpdateUserDetails updateUserDetails){
            this.updateUserDetails=updateUserDetails;
            return this;
        }

        public GymMemberDetails build(){return new GymMemberDetails(this);}

    }
}
