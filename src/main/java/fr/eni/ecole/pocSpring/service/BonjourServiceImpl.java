package fr.eni.ecole.pocSpring.service;

import org.springframework.stereotype.Service;

@Service("noir")
public class BonjourServiceImpl implements BonjourService {
    public void disBonjour() {
        System.out.println("Bonjour");
    }
}
