package com.dean.domain;

import java.util.Objects;

public class GymMemberLogin implements Comparable<GymMemberLogin> {
    private String emailAddress,password;


    private GymMemberLogin(){}

    private GymMemberLogin(Builder builder){
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }
    public String getEmailAddress(){return emailAddress;}

    public String getPassword(){return password;}

    @Override
    public int compareTo(GymMemberLogin o) {
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
        public Builder Copy(GymMemberLogin gymMemberLogin){
            this.emailAddress = gymMemberLogin.emailAddress;
            this.password = gymMemberLogin.password;

            return this;
        }
        public GymMemberLogin build(){return new GymMemberLogin(this);}
    }

    @Override
    public String toString() {
        return "GymMemberLogin{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GymMemberLogin that = (GymMemberLogin) o;
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
