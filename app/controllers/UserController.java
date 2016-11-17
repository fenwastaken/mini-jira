package controllers;

import models.Task;
import play.data.validation.Required;
import models.User;
import play.mvc.Controller;

import java.util.List;

/**
 * Created by Formation on 17/11/2016.
 */
public class UserController extends Controller{

    public static void create(){ render(); }

    public static void save(@Required String name, @Required String avatar, @Required String password){

        User user = new User();
        user.name = name;
        user.avatar = avatar;
        user.password = password;
        user.save();
        //render(user);
        displayAll();
    }
    public static void displayAll(){
        List<Task> listUsers = User.findAll();
        render(listUsers);
    }
}
