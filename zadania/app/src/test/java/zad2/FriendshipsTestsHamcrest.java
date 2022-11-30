package zad2;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FriendshipsTestsHamcrest {

    @Test
    public void testListLength() {

        Friendships friendships = new Friendships();
        friendships.makeFriends("Marek", "Ferdek");
        friendships.makeFriends("Marek", "Ewa");
        friendships.makeFriends("Marek", "Jonny");
        friendships.makeFriends("Marek", "Krzysiu");

        assertThat(friendships.getFriendsList("Marek"), hasSize(4));
    }

    @Test
    public void testListFriends() {
        Friendships friendships = new Friendships();

        friendships.makeFriends("Marek", "Ferdek");
        friendships.makeFriends("Marek", "Ewa");
        friendships.makeFriends("Marek", "Jonny");
        friendships.makeFriends("Marek", "Krzysiu");
        assertThat(friendships.getFriendsList("Marek"), contains("Ferdek", "Ewa", "Jonny", "Krzysiu"));
    }

    @Test
    public void testListFriendsOrdered() {
        Friendships friendships = new Friendships();

        friendships.makeFriends("Marek", "Ferdek");
        friendships.makeFriends("Marek", "Ewa");
        friendships.makeFriends("Marek", "Jonny");
        friendships.makeFriends("Marek", "Krzysiu");
        assertThat(friendships.getFriendsList("Marek"), containsInAnyOrder("Ewa", "Ferdek", "Krzysiu", "Jonny"));
    }

    @Test
    public void testListContentLength() {
        Friendships friendships = new Friendships();

        friendships.makeFriends("Mark", "123");
        assertThat(friendships.getFriendsList("Mark").size() == 1, equalTo(true));
    }

}
