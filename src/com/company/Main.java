package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] wordList = {"TAN", "ABRACADABRA", "WHOA", "AARDVARK", "EGGS", "A"};
        public String scrambleWord(String input)
        {
            String output = "";
            String beforeA;
            String A;
            String afterA;
            for(int i = 0; i < input.length(); i++)
            {
                if(input.substring(i, i + 1).equals("A") && !input.substring(i+1, i+2).equals("A"))
                {
                    beforeA = input.substring(0, i);
                    A = input.substring(i, i + 1);
                    afterA = input.substring(i + 1, i + 2);
                    output = beforeA + afterA + A + input.substring(i + 2);

                }
            }
            return output;
        }

        public void scrambleOrRemove(String[] wordList)
        {
            String placeholder;
            for(int i = 0; i < wordList.length; i++)
            {
                placeholder = wordList[i];
                wordList[i] = scrambleWord(wordList[i]);
                if(placeholder.equals(wordList[i]))
                {
                    wordList[i] = null;
                }
            }
        }
    }
}
