package com.example.a7july_icard;

public class Person {

    private int Image;
    private String Company,Profession,Age;

    public Person(String age, int image, String company, String profession) {
        Age = age;
        Image = image;
        Company = company;
        Profession = profession;
    }
    public String getAge() {
        return Age;
    }

    public int getImage() {
        return Image;
    }

    public String getCompany() {
        return Company;
    }

    public String getProfession() {
        return Profession;
    }


}
