package de.msm.msmcenter.service;

import de.msm.msmcenter.model.entitiys.Einsatzkraft;
import de.msm.msmcenter.model.entitiys.User;

import java.security.SecureRandom;

public class EinsatzkraftService {
    Einsatzkraft einsatzkraft;
    public EinsatzkraftService(Einsatzkraft einsatzkraft){
        this.einsatzkraft = einsatzkraft;
    }

    public User generateUser(){
        String name = einsatzkraft.getName();
        String id = Integer.toString(einsatzkraft.getId());
        String komplett = name+id;
        String password = createPassword(8);
        String email = einsatzkraft.getEMail();
        String portalrecht = "einsatzkraft";
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setPortalrecht(portalrecht);
        user.setUsername(komplett);
        return user;
    }

    public static String createPassword(int length){
        final String allowedChars = "0123456789abcdefghijklmnopqrstuvwABCDEFGHIJKLMNOP!§$%&?*+#";
        SecureRandom random = new SecureRandom();
        StringBuilder pass = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            pass.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
        }
        return pass.toString();
    }

}
