package com.dean.domain;

import java.util.Objects;

public class TrainerLogin implements Comparable<TrainerLogin>{
    private String emailAddress,password;


    private TrainerLogin(){}

    private TrainerLogin(Builder builder){
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }
    public String getEmailAddress(){return emailAddress;}

    public String getPassword(){return password;}

    @Override
    public int compareTo(TrainerLogin o) {
        return this.emailAddress.compareTo(o.emailAddress);
    }

    public static class Builder{
        private String emailAddress,password;

        public Builder emailAddress(String emailAddress){
            this.emailAddress=emailAddress;
            return this;
        }
        public Builder password(String password){
            this.password=password;
            return this;
        }
        public Builder Copy(TrainerLogin trainerLogin){
            this.emailAddress = trainerLogin.emailAddress;
            this.password = trainerLogin.password;

            return this;
        }
        public TrainerLogin build(){return new TrainerLogin(this);}
    }

    @Override
    public String toString() {
        return "TrainerLogin{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerLogin that = (TrainerLogin) o;
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
