package com.company;

public class Methods {
    public static String scrambleWord(String input)
    {
        String output = "";
        String beforeA;
        String A;
        String afterA;
        for(int i = 0; i < input.length(); i++)
        {
            if(input.substring(i, i + 1).equals("A"))
            {
                beforeA = input.substring(0, i);
                A = input.substring(i, i + 1);
                afterA = input.substring(i + 1, i + 2);
                output = beforeA + afterA + A + input.substring(i + 2);

            }
        }
        return output;
    }
}
