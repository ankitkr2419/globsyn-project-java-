package pack1;

import java.io.Serializable;

public class StudentObj implements Serializable {
	private String user_id;
	private String name;
	private String email;
	private String stream;
	private String sem;
	private String dob;
	public StudentObj(String user_id, String name, String email, String stream,String sem
	 ,String dob)
	{
		super();
		this.user_id =user_id;
		this.name=name;
		this.email=email;
		this.stream=stream;
		this.sem= sem;
		this.dob =dob;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
}
