package com.dean.domain;

import java.util.Objects;

public class CoachResetPassword implements Comparable<CoachResetPassword> {
    private String emailAddress;


    private CoachResetPassword(){}

    private CoachResetPassword(Builder builder){
        this.emailAddress = builder.emailAddress;

    }
    public String getEmailAddress(){return emailAddress;}

    @Override
    public int compareTo(CoachResetPassword o) {
        return this.emailAddress.compareTo(o.emailAddress);
    }

    public static class Builder{
        private String emailAddress;

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(CoachResetPassword coachResetPassword){
            this.emailAddress = coachResetPassword.emailAddress;

            return this;
        }
        public CoachResetPassword build(){
            return new CoachResetPassword(this);
        }
    }

    @Override
    public String toString() {
        return "CoachResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoachResetPassword that = (CoachResetPassword) o;
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
