package com.dean.domain;

import java.util.Objects;

public class GymMemberUpdateDetails implements Comparable<GymMemberUpdateDetails> {
    private String name,surname;

    private GymMemberUpdateDetails(){}

    private GymMemberUpdateDetails(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    @Override
    public int compareTo(GymMemberUpdateDetails o) {
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
        public Builder Copy(GymMemberUpdateDetails gymMemberUpdateDetails){
            this.name = gymMemberUpdateDetails.name;
            this.surname = gymMemberUpdateDetails.surname;

            return this;
        }
        public GymMemberUpdateDetails build(){return new GymMemberUpdateDetails(this);}

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
        GymMemberUpdateDetails that = (GymMemberUpdateDetails) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
