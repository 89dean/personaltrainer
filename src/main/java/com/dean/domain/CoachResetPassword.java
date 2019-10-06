package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
public class CoachResetPassword implements Comparable<CoachResetPassword>{
    @Id
    private String resetId;
    private String emailAddress;


    private CoachResetPassword(){}

    private CoachResetPassword(Builder builder){
        this.emailAddress = builder.emailAddress;

    }
    public String getResetId(){return resetId;}

    public String getEmailAddress(){return emailAddress;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoachResetPassword)) return false;
        CoachResetPassword coachResetPassword = (CoachResetPassword) o;
        return getResetId().equals(coachResetPassword.getResetId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResetId());
    }
    @Override
    public String toString() {
        return "CoachResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                ", resetId='" + resetId + '\'' +
                '}';
    }
    @Override
    public int compareTo(CoachResetPassword coachResetPassword) {
        return this.getResetId().compareToIgnoreCase(coachResetPassword.resetId);
    }

    public static class Builder{
        @Id
        private String resetId;
        private String emailAddress;

        public Builder resetId(String id){
            this.resetId = id;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(CoachResetPassword coachResetPassword){
            this.resetId = coachResetPassword.resetId;
            this.emailAddress = coachResetPassword.emailAddress;

            return this;
        }
        public CoachResetPassword build(){
            return new CoachResetPassword(this);
        }
    }
}
