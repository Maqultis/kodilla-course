package com.kodilla.good.patterns.challenges.Allegro;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Thank you " + user.getUsername() + " for your order!");
    }

}
