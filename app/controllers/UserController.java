package controllers;

import play.data.validation.Required;
import models.User;
import play.mvc.Controller;

/**
 * Created by Formation on 17/11/2016.
 */
public class UserController extends Controller{

    public static void create(){ render(); }

    public static void save(@Required String name){

        User user = new User();
        user.name = name;
        user.save();
        render(user);
    }

    public static void login(@Required String name, @Required String password){


        user.login();

    }
}
