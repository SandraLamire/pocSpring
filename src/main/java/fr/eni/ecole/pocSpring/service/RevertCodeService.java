package fr.eni.ecole.pocSpring.service;

import org.springframework.stereotype.Service;

@Service("revert")
public class RevertCodeService implements CoderService {

    @Override
    public void afficheString(String message) {
        StringBuilder strb = new StringBuilder(message);
        String revertMessage = strb.reverse().toString();
        System.out.println(revertMessage);
        // OU
        // return new StringBuilder(message).reverse().toString();
    }
}
