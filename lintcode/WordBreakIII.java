/*
Give a dictionary of words and a sentence with all whitespace removed, return
the number of sentences you can form by inserting whitespaces to the sentence
so that each word can be found in the dictionary.

Example
Given a String CatMat
Given a dictionary ["Cat", "Mat", "Ca", "tM", "at", "C", "Dog", "og", "Do"]
return 3

we can form 3 sentences, as follows:
CatMat = Cat Mat
CatMat = Ca tM at
CatMat = C at Mat
 */
public class WordBreakIII {

    /*
     * @param : A string
     * @param : A set of word
     * @return: the number of possible sentences.
     */
    private int result = 0;

    public int wordBreak3(String s, Set<String> dict) {
        for (int i = 1; i < s.length(); ++i) {
            if (dict.contains(s.substring(0, i)) && dict.contains(s.substring(i))) {
                result++;
            }
        }
        return result;
    }

}
