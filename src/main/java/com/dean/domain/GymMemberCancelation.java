package com.dean.domain;

import java.util.Objects;

public class GymMemberCancelation implements Comparable<GymMemberCancelation>{
    private String name,surname,cancelMessage;

    private GymMemberCancelation(){}

    private GymMemberCancelation(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.cancelMessage=builder.cancelMessage;

    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getCancelMessage(){return cancelMessage;}

    @Override
    public int compareTo(GymMemberCancelation o) {
        return this.name.compareTo(o.name);
    }

    public static class Builder{
        private String name,surname,cancelMessage;

        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder cancelMessage(String cancelMessage){
            this.cancelMessage=cancelMessage;
            return this;
        }
        public Builder Copy(GymMemberCancelation gymMemberCancelation){
            this.cancelMessage = gymMemberCancelation.cancelMessage;
            this.name = gymMemberCancelation.name;
            this.surname = gymMemberCancelation.surname;

            return this;
        }
        public GymMemberCancelation build(){return new GymMemberCancelation(this);}
    }

    @Override
    public String toString() {
        return "GymMemberCancelation{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cancelMessage='" + cancelMessage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GymMemberCancelation that = (GymMemberCancelation) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
