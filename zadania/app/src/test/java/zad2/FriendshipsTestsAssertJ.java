package zad2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FriendshipsTestsAssertJ {

    @Test
    public void testListLength() {
        Friendships friendships = new Friendships();
        friendships.makeFriends("Marek", "Ferdek");
        friendships.makeFriends("Marek", "Ewa");
        friendships.makeFriends("Marek", "Jonny");
        friendships.makeFriends("Marek", "Krzysiu");
        assertThat(friendships.getFriendsList("Marek")).hasSize(4).containsOnly("Ferdek", "Ewa", "Jonny", "Krzysiu");
    }

    @Test
    public void testListLengthAnyOrder() {
        Friendships friendships = new Friendships();
        friendships.makeFriends("Marek", "Ferdek");
        friendships.makeFriends("Marek", "Ewa");
        friendships.makeFriends("Marek", "Jonny");
        friendships.makeFriends("Marek", "Krzysiu");
        assertThat(friendships.getFriendsList("Marek")).hasSize(4).containsExactlyInAnyOrder("Ewa", "Ferdek", "Krzysiu", "Jonny");
    }

    @Test
    public void testListLengthAnyOrderNotNull() {
        Friendships friendships = new Friendships();
        friendships.makeFriends("Marek", "Ferdek");
        friendships.makeFriends("Marek", "Ewa");
        friendships.makeFriends("Marek", "Jonny");
        friendships.makeFriends("Marek", "Krzysiu");
        assertThat(friendships.getFriendsList("Marek")).hasSize(4).doesNotContainNull();
    }

    @Test
    public void testListBegin() {
        Friendships friendships = new Friendships();
        friendships.makeFriends("Marek", "Ferdek");
        friendships.makeFriends("Marek", "Ewa");
        friendships.makeFriends("Marek", "Jonny");
        friendships.makeFriends("Marek", "Krzysiu");
        assertThat(friendships.getFriendsList("Marek")).hasSize(4).startsWith("Ferdek");
    }

    @Test
    public void testListContain() {
        Friendships friendships = new Friendships();

        friendships.makeFriends("Marek", "Ferdek");
        friendships.makeFriends("Marek", "Ewa");
        friendships.makeFriends("Marek", "Jonny");
        friendships.makeFriends("Marek", "Krzysiu");
        assertThat(friendships.getFriendsList("Marek")).hasSize(4).contains("Jonny");
    }
}
