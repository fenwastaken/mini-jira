package controllers;


import play.data.validation.Required;
import play.mvc.Controller;

public class TaskController extends Controller{
    public static void create(){ render(); }

    public static void save(@Required String name, @Required String content, @Required Boolean urgent){
        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Task task = new Task();
        task.name = name;
        task.content = content;
        task.urgent = urgent;
        task.save();
        render(task);
    }

}
