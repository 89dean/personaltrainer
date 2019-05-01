package com.dean.domain;

import java.util.Objects;

public class CoachUpdateDetails implements Comparable<CoachUpdateDetails>{
    private String name,surname;

    private CoachUpdateDetails(){}

    private CoachUpdateDetails(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    @Override
    public int compareTo(CoachUpdateDetails o) {
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
        public Builder Copy(CoachUpdateDetails coachUpdateDetails){
            this.name=coachUpdateDetails.name;
            this.surname=coachUpdateDetails.surname;
            return this;
        }
        public CoachUpdateDetails build(){return new CoachUpdateDetails(this);}

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
        CoachUpdateDetails that = (CoachUpdateDetails) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
