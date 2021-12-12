package com.example.login;
import javax.swing.JOptionPane;
/**
 * @author - John Schmidt
 * 07.12.2021, 22:41
 */
public class X07SwingJOptionPaneTest {
    public static void main(String[] args) {

        String name1 = JOptionPane.showInputDialog("Gib den ersten Namen ein!");
        String name2 = JOptionPane.showInputDialog("Gib den zweiten Name ein!");

        int num1 = name1.length();
        int num2 = name2.length();
        int sum = num1+num2;

        JOptionPane.showMessageDialog(null, "Sie lieben sich zu "
        + sum + " %!", "Liebesprogramm", JOptionPane.PLAIN_MESSAGE);


    }
}
