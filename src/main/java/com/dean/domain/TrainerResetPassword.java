package com.dean.domain;

import java.util.Objects;

public class TrainerResetPassword implements Comparable<TrainerResetPassword> {
    private String emailAddress;

    private TrainerResetPassword(){}

    private TrainerResetPassword(Builder builder){
        this.emailAddress = builder.emailAddress;

    }
    public String getEmailAddress(){return emailAddress;}

    @Override
    public int compareTo(TrainerResetPassword o) {
        return this.emailAddress.compareTo(o.emailAddress);
    }

    public static class Builder{
        private String emailAddress;

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(TrainerResetPassword trainerResetPassword){
            this.emailAddress = trainerResetPassword.emailAddress;

            return this;
        }
        public TrainerResetPassword build(){
            return new TrainerResetPassword(this);
        }
    }

    @Override
    public String toString() {
        return "TrainerResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerResetPassword that = (TrainerResetPassword) o;
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
