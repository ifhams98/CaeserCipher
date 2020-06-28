/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencryption;

import javax.swing.JOptionPane;
public class TestEncryption
{
    public static void main(String arg[])
    {
        String code, output = "";
        String text = JOptionPane.showInputDialog("Enter message");
        output += "The original message is \n" + text + "\n";
        Cipher c = new Caeser(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nCeasar Cipher\nThe encrypted message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output +="The decrypted message is \n" + code + "\n";
        c = new Transpose(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nTranspose\nThe encrypted Transpose message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output +="The decripted Transpose message is \n" + code + "\n";
        Reverser r = new Reverser(text);
        code = r.reverseText(code);
        output += "\nReverser\nThe encrypted Reverse message is \n" + code+ "\n";
        code = r.decode(code);
        output+="The decrypted Reverse message is \n" + code;
        display(output);
    }
    static void display(String s)
    {
        JOptionPane.showMessageDialog(null, s, "Encrypt/decrypt",
        JOptionPane.INFORMATION_MESSAGE);
    }
}

