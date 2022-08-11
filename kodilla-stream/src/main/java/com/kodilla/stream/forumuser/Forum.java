package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public List<ForumUser> getUserList() {
       List<ForumUser> result = new ArrayList<>();
       result.add(new ForumUser(1, "John Smith", 'M' , LocalDate.of(1990,5, 15), 10));
       result.add(new ForumUser(2, "Anna Nowak", 'F' , LocalDate.of(1980,1,10), 5));
       result.add(new ForumUser(3, "Jan Kowalski", 'M' , LocalDate.of(1992,12,5), 0));
       result.add(new ForumUser(4, "Tomasz Zet", 'M' , LocalDate.of(1970,4,8), 20));
       result.add(new ForumUser(5, "Izabela Tajna", 'F' , LocalDate.of(1991,11,15), 25));
       result.add(new ForumUser(6, "Walter White", 'M', LocalDate.of(1988,12,7), 1));
       return result;
    }
}
