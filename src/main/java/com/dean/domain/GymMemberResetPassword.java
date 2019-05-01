package com.dean.domain;

import java.util.Objects;

public class GymMemberResetPassword implements Comparable<GymMemberResetPassword> {
    private String emailAddress;

    private GymMemberResetPassword(){}

    private GymMemberResetPassword(Builder builder){
        this.emailAddress = builder.emailAddress;

    }
    public String getEmailAddress(){return emailAddress;}

    @Override
    public int compareTo(GymMemberResetPassword o) {
        return this.emailAddress.compareTo(o.emailAddress);
    }

    public static class Builder{
        private String emailAddress;

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(GymMemberResetPassword gymMemberResetPassword){
            this.emailAddress = gymMemberResetPassword.emailAddress;

            return this;
        }
        public GymMemberResetPassword build(){
            return new GymMemberResetPassword(this);
        }
    }

    @Override
    public String toString() {
        return "GymMemberResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GymMemberResetPassword that = (GymMemberResetPassword) o;
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
