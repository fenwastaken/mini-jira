package controllers;

import models.Task;
import play.data.validation.Required;
import models.User;
import play.mvc.Controller;
import play.mvc.With;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by Formation on 17/11/2016.
 */


public class UserController extends Controller{

    public static void create(){ render(); }

    public static void save(@Required String name, @Required String avatar, @Required String password){

        User user = new User();
        user.name = name;
        user.avatar = avatar;
        user.password = BCrypt.hashpw(password, BCrypt.gensalt(12));
        user.save();
        //render(user);
        displayAll();
    }
    public static void displayAll(){
        List<Task> listUsers = User.findAll();
        render(listUsers);
    }
}
