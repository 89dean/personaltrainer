package com.dean.domain;

import java.util.Objects;

public class CoachLogin implements Comparable<CoachLogin> {
    private String emailAddress,password;


    private CoachLogin(){}

    private CoachLogin(Builder builder){
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }
    public String getEmailAddress(){return emailAddress;}

    public String getPassword(){return password;}

    @Override
    public int compareTo(CoachLogin o) {
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
        public Builder Copy(CoachLogin coachLogin){
            this.emailAddress = coachLogin.emailAddress;
            this.password = coachLogin.password;

            return this;
        }
        public CoachLogin build(){return new CoachLogin(this);}
    }
    @Override
    public String toString() {
        return "CoachLogin{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoachLogin that = (CoachLogin) o;
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
