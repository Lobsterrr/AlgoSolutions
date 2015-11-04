/*
 * You are playing the following Bulls and Cows game with your friend: You 
 * write a 4-digit secret number and ask your friend to guess it, each time 
 * your friend guesses a number, you give a hint, the hint tells your friend 
 * how many digits are in the correct positions (called "bulls") and how many 
 * digits are in the wrong positions (called "cows"), your friend will use 
 * those hints to find out the secret number.

 * For example:

 * Secret number:  1807
 * Friend's guess: 7810
 * Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
 * According to Wikipedia: "Bulls and Cows (also known as Cows and Bulls or 
 * Pigs and Bulls or Bulls and Cleots) is an old code-breaking mind or paper 
 * and pencil game for two or more players, predating the similar commercially 
 * marketed board game Mastermind. The numerical version of the game is 
 * usually played with 4 digits, but can also be played with 3 or any other 
 * number of digits."

 * Write a function to return a hint according to the secret number and 
 * friend's guess, use A to indicate the bulls and B to indicate the cows, in 
 * the above example, your function should return 1A3B.

 * You may assume that the secret number and your friend's guess only contain 
 * digits, and their lengths are always equal.
 */
public class BullsAndCows {

    public String getHint(String secret, String guess) {
        String result = "";
        Set<Character> sSet = new HashSet<Character>();
        for (int i = 0; i < secret.length(); ++i) {
            sSet.add(secret.charAt(i));
        }
        int bullsCount = 0;
        int cowsCount = 0;
        Set<Character> gCows = new HashSet<Character>();
        for (int i = 0; i < guess.length(); ++i) {
            if (sSet.contains(guess.charAt(i))) {
                if (guess.charAt(i) == secret.charAt(i)) {
                    bullsCount++;
                } else {
                    if (!gCows.contains(guess.charAt(i))) {
                        cowsCount++;
                        gCows.add(guess.charAt(i));
                    }
                }
            }
        }
        result = bullsCount + "A" + cowsCount + "B";
        return result;
    }


    public String getHint(String secret, String guess) {
        String result = "";
        int bullsCount = 0;
        for (int i = 0; i < guess.length(); ++i) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bullCount++;
            }
        }
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        for (int i = 0; i < secret.length(); ++i) {
            if (sMap.containsKey(secret.charAt(i))) {
                sMap.put(secret.charAt(i), sMap.get(secret.charAt(i)) + 1);
            } else {
                sMap.put(secret.charAt(i), 1);
            }
        }
        Map<Character, Integer> gMap = new HashMap<Character, Integer>();
        for (int i = 0; i < guess.length(); ++i) {
            if (gMap.containsKey(guess.charAt(i))) {
                gMap.put(guess.charAt(i), gMap.get(guess.charAt(i)) + 1);
            } else {
                gMap.put(guess.charAt(i), 1);
            }
        }


        int cowsCount = 0;
        for (int i = 0; i < guess.length(); ++i) {
            if (map.containsKey(guess.charAt(i))) {
                if (guess.charAt(i) == secret.charAt(i)) {
                       
                }

                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
        }
    }

}
