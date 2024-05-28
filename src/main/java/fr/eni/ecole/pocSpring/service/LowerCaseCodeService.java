package fr.eni.ecole.pocSpring.service;

import org.springframework.stereotype.Service;

@Service("lower")
public class LowerCaseCodeService implements CoderService {
    public void afficheString(String message) {
        String messageEnMinuscules = message.toLowerCase();
        System.out.println(messageEnMinuscules);
        // return message.toLowerCase()
    }
}
