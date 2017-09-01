package com.sda.exercise;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private List<Skill> skills;

    public User(){
        skills= new ArrayList<>();
    }


    public User(Integer id, String name, Integer age, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public void addSkill(Skill s){
        this.skills.add(s);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills.get(0).getName() +
                '}';
    }
}
