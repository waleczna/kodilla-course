package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

class StreamMain {
    public static void main(String[] args) {
       // PoemBeautifier poemBeautifier = new PoemBeautifier();
       // System.out.println(poemBeautifier.beautify("abc", s -> "!" + s.toUpperCase() + "!"));
       // System.out.println(poemBeautifier.beautify("abcdefg", s -> s.substring(1, 3)));
       // System.out.println(poemBeautifier.beautify("aBcDeF", s -> s.toUpperCase()));

   Forum forum = new Forum();
        Map<Integer, ForumUser> result = forum.getUserList().stream()
                .filter(fu -> fu.getSex() == 'M')
                .filter(fu -> fu.getDateOfBirth().getYear() <= LocalDate.now().getYear() - 20)
                .filter(fu -> fu.getPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, fu -> fu));

        System.out.println(result);
    }
}
