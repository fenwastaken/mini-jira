package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class User extends Model {

	String name;
	String password;
	String avatar;

    public User (){}

    public User (String name){
        super();
        this.name = name;
    }
	
	public User(String name, String password, String avatar) {
		super();
		this.name = name;
		this.password = password;
		this.avatar = avatar;
	}
	
}
