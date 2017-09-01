package com.sda;

import com.sda.exercise.Functions;
import com.sda.exercise.User;
import com.sda.generator.UserGenerator;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        UserGenerator userGenerator = new UserGenerator();
        List<User> myUserList = userGenerator.createRandomUsers(5);
        Functions myFunctionsClass = new Functions();


        System.out.println("\n---- Print all users----");
        myUserList.forEach(user -> System.out.println(user.toString()));


        System.out.println("\n---- getAllNames----");
        List<String> myUsersNames = myFunctionsClass.getAllNames(myUserList);
        myUsersNames.forEach(System.out::println);


        System.out.println("\n---- getUniqueNames ----");
        Set<String> myUsersNamesSet = myFunctionsClass.getUniqueNames(myUserList);
        myUsersNamesSet.forEach(System.out::println);


        System.out.println("\n---- Age average----");
        System.out.println(myFunctionsClass.getAverangeAge(myUserList));

        System.out.println("\n---- Max age----");
        System.out.println(myFunctionsClass.getMaximumAge(myUserList));

        System.out.println("\n---- Min age----");
        System.out.println(myFunctionsClass.getMinimumAge(myUserList));

//        System.out.println("\n---- Max age----");
//        myFunctionsClass.groupById(myUserList).forEach(i -> System.out.println(i) ,user-> S);




    }
}
