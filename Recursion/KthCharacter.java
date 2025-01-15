package Recursion;

public class KthCharacter {
    public char kthCharacter(int k) {
        String word="a";
        int length=word.length();
        word=checkWord(word,length,k);

        System.out.println("Word is \t"+word+" and required character at index "+k+" is "+word.charAt(k-1)+"\n");
        return word.charAt(k-1);
    }

    private String checkWord(String word,int len,int k) {
        if (len>=k)
        {
            return word;
        }
        int size=word.length();
        for(int i=0;i<size;i++)
        {
            char ch=word.charAt(i);
            ch = (char) (ch + 1);
            word=word+ch;
        }
        word=checkWord(word,word.length(),k);
        return word;
    }

    public static void main() {
        KthCharacter kthCharacter = new KthCharacter();
        int k = 5;
        char result = kthCharacter.kthCharacter(k);
        System.out.println("The " + k + "th character is: " + result);

    }
}
