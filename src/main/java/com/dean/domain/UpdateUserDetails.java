package com.dean.domain;

public class UpdateUserDetails {
    private String name,surname;

    private UpdateUserDetails(){}

    private UpdateUserDetails(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
    }
    public String getName(String name){return name;}

    public String getSurname(String surname){return surname;}

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
        public UpdateUserDetails build(){return new UpdateUserDetails(this);}

    }

    @Override
    public String toString() {
        return "UpdateUserDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
