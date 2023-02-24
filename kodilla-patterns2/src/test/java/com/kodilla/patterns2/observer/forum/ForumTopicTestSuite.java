package com.kodilla.patterns2.observer.forum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumTopicTestSuite {

    @Test
    public void testUpdate() {
        // Given
                // test polega na utworzeniu dwóch wątków forum oraz trzech użytkowników
                // następnie użytkownicy są subskrybowani na powiadomienia o nowych postach w poszczególnych wątkach forum
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registryObserver(johnSmith);
        javaToolsForum.registryObserver(ivoneEscobar);
        javaHelpForum.registryObserver(jessiePinkman);
        javaToolsForum.registryObserver(jessiePinkman);
        // When
                    // do obu wątków forum dodawane są przykładowe posty
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message");
        // Then
                // asercje sprawdzające czy poszczególni użytkownicy otrzymali odpowiednią ilość powiadomień o aktualizacjach
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}

