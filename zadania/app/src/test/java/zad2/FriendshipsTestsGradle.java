package zad2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class FriendshipsTestsGradle {


    @Test
    public void testMakeFriends() {
        Friendships friends = new Friendships();

        friends.makeFriends("Adam", "John");
        assertTrue(friends.areFriends("Adam", "John"));
    }

    @Test
    public void testMakeFriendsReverse() {
        Friendships friends = new Friendships();

        friends.makeFriends("Adam", "John");
        assertTrue(friends.areFriends("John", "Adam"));
    }


    @Test
    public void testListNotEmpty() {
        Friendships friends = new Friendships();
        friends.makeFriends("Mark", "Adam");
        Assertions.assertNotEquals(Collections.EMPTY_LIST, friends.getFriendsList("Adam"));

    }

    @Test
    public void testFriendsListSize() {
        Friendships friends = new Friendships();
        friends.makeFriends("Mike", "123");
        friends.makeFriends("Mike", "124");

        assertTrue(friends.getFriendsList("Mike").size() == 2);
    }

}
