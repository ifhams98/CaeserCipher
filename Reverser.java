/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencryption;


public class Reverser extends Transpose
{
    public Reverser(String s)
    {
        // Complete the constructor
        super(s);
    }
    public String reverseText(String word)
    {
        // Complete this method so that it reverses the original string
        StringBuffer sb = new StringBuffer(word);
        sb.reverse();
        encrypted_message = sb;
        return sb.toString();
    }
    public String decode(String word)
    {
        // Complete this method so that it reverses the reversed string
        StringBuffer sb = new StringBuffer(word);
        sb.reverse();
        decrypted_message = sb;
        return sb.toString();
    }
}
