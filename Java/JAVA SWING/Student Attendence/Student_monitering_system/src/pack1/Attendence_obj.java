package pack1;

import java.io.Serializable;

public class Attendence_obj implements Serializable{
	private String paper;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String oclass;
	private String vclass;
	private String present;
	private String absent;
	private String id; 
	
	public Attendence_obj(String id,String paper, String oclass, String vclass, String present,String absent)
	{
		super();
		this.id =id;
		this.paper =paper;
		this.oclass =oclass;
		this.vclass = vclass;
		this.present = present;
		this.absent = absent;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public String getOclass() {
		return oclass;
	}
	public void setOclass(String oclass) {
		this.oclass = oclass;
	}
	public String getVclass() {
		return vclass;
	}
	public void setVclass(String vclass) {
		this.vclass = vclass;
	}
	public String getPresent() {
		return present;
	}
	public void setPresent(String present) {
		this.present = present;
	}
	public String getAbsent() {
		return absent;
	}
	public void setAbsent(String absent) {
		this.absent = absent;
	}
}
