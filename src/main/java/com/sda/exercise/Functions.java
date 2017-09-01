package com.sda.exercise;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Functions {
    /*
    List<String> getAllNames(List<User> users) -zwraca listę wszystkich imion
    .2.5.Set<String> getUniqueNames(List<User> users) -zwraca setwszystkich imion(unikalne).
    2.6.Double getAverangeAge(List<User> users) -liczy średni wiek użytkowników.
    2.7.Integer getMaximumAge(List<User> users) -zwraca wiek najstarszego użytkownika.
    2.8.Ineger getMinimumAge(List<User> users) -zwraca wiek najmłodszego użytkownia.
    2.9.Map<Integer,User> groupById(List<User> users) -grupuje użytkowników po ich id.
    2.10.String joinNamesByDelimiter(List<User> users,Stringdelimiter) -zwraca wszystkie imiona odzielone zadanym znakiem.
    2.11.List<Skill> getAllSkills(List<User> users) -zwraca listę wszystkich umiejętności.
    2.12.Set<Skill> getlUniqueSkills(List<User> users)
     */
    public List<String> getAllNames(List<User> users) {
        return users.stream().map(user -> user.getName()).collect(Collectors.toList());
    }

    public Set<String> getUniqueNames(List<User> users) {
        return users.stream()
                .map(user -> user.getName())
                .distinct()
                .collect(Collectors.toSet());
    }

    public Double getAverangeAge(List<User> users){
        return users.stream()
                .mapToInt(user -> user.getAge())
                .average()
                .getAsDouble();
    }


    public Integer getMaximumAge(List<User> users){
        return users.stream()
                .mapToInt(user -> user.getAge())
                .max()
                .getAsInt();
    }

    public Integer getMinimumAge(List<User> users){
        return users.stream()
                .mapToInt(user -> user.getAge())
                .min()
                .getAsInt();

    }

    public Map<Integer,User> groupById(List<User> users){
        Comparator<User> byUserId= Comparator.comparingInt(User::getId);

        return users.stream()
                .sorted(byUserId)
                .collect(Collectors.toMap(user-> user.getId(), user->user));

    }

}
