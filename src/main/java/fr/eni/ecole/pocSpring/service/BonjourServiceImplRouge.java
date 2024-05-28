package fr.eni.ecole.pocSpring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("rouge")
@Primary
public class BonjourServiceImplRouge implements BonjourService {
    public void disBonjour() {
        System.err.println("Bonjour");
    }
}
