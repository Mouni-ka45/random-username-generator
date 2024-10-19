import java.util.Random;

public class RandomUsernameGenerator {

    private static final String[] PREFIXES = {
            "Cool", "Happy", "Crazy", "Silly", "Wise", "Epic", "Charming", "Swift"
    };

    private static final String[] ADJECTIVES = {
            "Fox", "Lion", "Eagle", "Wolf", "Tiger", "Panda", "Shark", "Dragon"
    };

    private static final Random random = new Random();

    public static void main(String[] args) {
        int numberOfUsernames = 10; // Change this for more or fewer usernames
        for (int i = 0; i < numberOfUsernames; i++) {
            System.out.println(generateUsername());
        }
    }

    private static String generateUsername() {
        String prefix = PREFIXES[random.nextInt(PREFIXES.length)];
        String adjective = ADJECTIVES[random.nextInt(ADJECTIVES.length)];
        int number = random.nextInt(100); // Generates a number between 0 and 99
        return prefix + adjective + number;
    }
}
