/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Messege;

/**
 *
 * @author Asus
 */
public class Sender {
    
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("===StdMessenger===\n");
        std.sendMessage("secret", "introduction", "Hai!");
        std.sendMessage("Indriyana", "introduction", "What is your name?");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("===MailMessenger===\n");
        mail.connect();
        mail.sendMessage("secret", "information", "Graduation");
        mail.sendMessage("Benka", "Introduction", "Halooo");
        mail.disconnect();
        mail.sendMessage("Indriyana", "information", "Graduation");
    }
}
