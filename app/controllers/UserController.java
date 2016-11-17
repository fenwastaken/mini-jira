package controllers;

import models.Task;
import play.data.validation.Required;
import models.User;
import play.mvc.Controller;
import play.mvc.With;

import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */

@With(Secure.class)
public class UserController extends Controller{

    public static void create(){ render(); }

    public static void save(@Required String name){

        User user = new User();
        user.name = name;
        user.save();
        render(user);
    }
    public static void displayAll(){
        List<Task> listUsers = User.findAll();
        render(listUsers);
    }
}
