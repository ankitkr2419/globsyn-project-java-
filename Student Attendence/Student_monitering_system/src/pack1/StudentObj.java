package pack1;

import java.io.Serializable;

public class StudentObj implements Serializable {
	private String user_id;
	private String name;
	private String email;
	private String stream;
	private String sem;
	private String dob;
	private String sex;
	private String fathername;
	private String mothername;
	private String address;
	private String cname;
	public StudentObj(String user_id, String name, String email, String stream,String sem
	 ,String dob,String sex,String fathername,String mothername,String address,String cname)
	{
		super();
		this.user_id =user_id;
		this.name=name;
		this.email=email;
		this.stream=stream;
		this.sem= sem;
		this.dob =dob;
		this.sex =sex;
		this.fathername =fathername;
		this.mothername =mothername;
		this.address =address;
		this.cname =cname;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
