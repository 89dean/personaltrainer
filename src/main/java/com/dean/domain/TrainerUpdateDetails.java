package com.dean.domain;

import com.dean.factory.TrainerUpdateDetailsFactory;

import java.util.Objects;

public class TrainerUpdateDetails implements Comparable<TrainerUpdateDetails> {
    private String name,surname;

    private TrainerUpdateDetails(){}

    private TrainerUpdateDetails(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    @Override
    public int compareTo(TrainerUpdateDetails o) {
        return this.name.compareTo(o.name);
    }

    public static class Builder{
        private String name,surname;

        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder Copy(TrainerUpdateDetails trainerUpdateDetails){
            this.name = trainerUpdateDetails.name;
            this.surname = trainerUpdateDetails.surname;

            return this;
        }
        public TrainerUpdateDetails build(){return new TrainerUpdateDetails(this);}

    }

    @Override
    public String toString() {
        return "UpdateUserDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerUpdateDetails that = (TrainerUpdateDetails) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
