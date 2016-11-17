package controllers.secure;

import controllers.Secure;


import controllers.Application;
import models.User;
import play.Logger;

public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {

        Logger.debug("tentative de connexion de " + username);

        User user = User.find("username = ?1", username).first();

        //User user = UserController.getUserByName(username);

        if (user != null && user.password.equals(password)) {

            return true;

        }

        return false;

    }

    public static String connected() {

        return session.get("username");

    }

    public static boolean isConnected() {

        return session.contains("username");

    }

    static void onDisconnected() {

        Application.index();

    }

}