/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencryption;

public class Caeser extends Cipher
{
    public Caeser(String s)
    {
        super(s);
    }
    public String encode(String word)
    {
        return code(word,3);
    }
    public String decode(String word)
    {
        // Complete this method so that it decodes the encoded string
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            ch = determineCharacter(ch, -3);
            result.append(ch);
        }
        return result.toString();
    }
    String code(String word, int SHIFT)
    {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            ch = determineCharacter(ch, SHIFT);
            result.append(ch);
        }
        return result.toString();
    }
    public char determineCharacter(char ch, final int shift)
    {
        if(Character.isUpperCase(ch))
            ch = (char)('A' + (ch - 'A' + shift + 26) % 26);
        else if (Character.isLowerCase(ch))
            ch = (char)('a' + (ch - 'a' + shift + 26) % 26);
        return ch;
    }
}
