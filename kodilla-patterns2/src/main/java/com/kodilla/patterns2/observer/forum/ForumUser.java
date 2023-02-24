package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer {
    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + ": New messages in topic " + forumTopic.getName() + "\n" +
                " (total: " + forumTopic.getMessages().size() + " messages)");
        updateCount++;  //metoda update(ForumTopic forumTopic), którą będą wywoływały obiekty implementujące interfejs Observable podczas zmian (czyli podczas dodawania nowych postów w grupach)
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}


