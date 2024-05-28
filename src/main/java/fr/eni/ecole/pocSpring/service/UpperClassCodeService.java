package fr.eni.ecole.pocSpring.service;

import org.springframework.stereotype.Service;

@Service("upper")
public class UpperClassCodeService implements CoderService {
    public void afficheString(String message) {
        String messageEnMajuscules = message.toUpperCase();
        System.out.println(messageEnMajuscules);
        // OU
        // return message.toUpperCase();
    }
}
