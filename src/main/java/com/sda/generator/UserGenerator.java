package com.sda.generator;

import com.sda.exercise.Skill;
import com.sda.exercise.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    private List<Integer> ids;
    private List<String> names;
    private List<Integer> ages;
    private List<Skill> skills;
    private List<Integer> idsAlreadyUsed;

    public UserGenerator() {
        initAge();
        initNames();
        initSkills();
        idsAlreadyUsed = new ArrayList<>();
    }


    public List<User> createRandomUsers(int n) {
        initIds(n);
        List<User> listOfUsers = new ArrayList<>();
        Random myRandom = new Random();
        for (int i = 0; i < n; i++) {
            User tempUser = new User();
            tempUser.setName(names.get(myRandom.nextInt(names.size())));
            tempUser.setAge(ages.get(myRandom.nextInt(ages.size())));
            tempUser.addSkill(skills.get(myRandom.nextInt(skills.size())));
            tempUser.setId(returnId());
            listOfUsers.add(tempUser);

        }
        return listOfUsers;
    }

    private int returnId() {
        Random random = new Random();
        boolean bool = true;
        Integer i;
        while (bool) {
            i = random.nextInt(ids.size());
            if (!idsAlreadyUsed.contains(i)) {
                return i;
            }
        }
        return -1;
    }


    private void initNames() {
        names = Arrays.asList("Gregor", "Jane", "John", "Ivan", "Frank", "Johnatan", "Jack", "Michael", "Jessica");
    }

    private void initAge() {
        ages = Arrays.asList(22, 23, 24, 25, 26, 27, 28, 29);
    }

    private void initSkills() {
        skills = Arrays.asList(new Skill("super szybkie nic nie robienie"), new Skill("bycie niewidzialnym gdy nikt nie patrzy"),
                new Skill("rysowanie w paincie"), new Skill("dmuchanie balonów na czas"), new Skill("czytanie kodów kreskowych"));
    }

    private void initIds(int n) {
        ids = new ArrayList<>();
        for (Integer i = 0; i < n; i++) {
            ids.add(i);
        }
    }



}
