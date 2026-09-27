package WordGames;
public class WordGames
{
   

    public static String scramble(String word)
    {
        int wordLength = word.length();
        int halfWords = wordLength / 2;
        String half1 = word.substring(0, halfWords);
        String half2 = word.substring(halfWords, wordLength);
        String scrambledWord = half2 + half1;
        return scrambledWord;
    }
    
    
    public static String bananaSplit(String word, int insertIdx, String insertText)
    {

        String result = word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
        return result;
    }
    
    
    public static String bananaSplit(String word, String insertChar, String insertText)
    {
        int index = word.indexOf(insertChar);

        String firstPart = word.substring(0, index);
        String secondPart = word.substring(index);
        return firstPart + insertText + secondPart;
    }

    
}