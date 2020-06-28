/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencryption;

public class Transpose extends Cipher
{
    Transpose(String s)
    {
        super(s);
    }
    public String encode(String word)
    {
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
    public String decode(String word)
    {
        //Complete this method so that it reverses the encoded string;
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
}