package pack1;

import java.io.Serializable;

public class ADMINOBJ implements Serializable {
private String name;
private String pass;
private String id;
private String post;

public ADMINOBJ(String name , String pass, String id, String post)
{
	this.name = name;
	this.pass =pass;
	this.id =id;
	this.post =post;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
}
