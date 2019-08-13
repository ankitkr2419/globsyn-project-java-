package pack1;

import java.io.Serializable;

public class Marks_obj  implements Serializable{
	
	private String Papercode;
	private String Papername;
	private String Totalmarks;
	private String Marksobtain;
	private String p_f; 
	private String id;

	/*public Marks_obj(String id,String Papercode,String Papername, String Totalmarks, String Marksobtain, String p_f)
	{
		super();
		this.id =id;
		this.Papercode =Papercode;
		this.Totalmarks =Totalmarks;
		this.Marksobtain =Marksobtain;
		this.p_f = p_f;
	}*/
	
	public Marks_obj(String id2, String pname, String pcode, String tmarks, String mobtain, String p_f2) {
		// TODO Auto-generated constructor stub
		super();
		this.id =id2;
		this.Papername=pname;
		this.Papercode =pcode;
		this.Totalmarks =tmarks;
		this.Marksobtain =mobtain;
		this.p_f = p_f2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getPapercode() {
		return Papercode;
	}

	public void setPapercode(String papercode) {
		Papercode = papercode;
	}

	public String getPapername() {
		return Papername;
	}

	public void setPapername(String papername) {
		Papername = papername;
	}

	public String getTotalmarks() {
		return Totalmarks;
	}

	public void setTotalmarks(String totalmarks) {
		Totalmarks = totalmarks;
	}

	public String getMarksobtain() {
		return Marksobtain;
	}

	public void setMarksobtain(String marksobtain) {
		Marksobtain = marksobtain;
	}

	public String getP_f() {
		return p_f;
	}

	public void setP_f(String p_f) {
		this.p_f = p_f;
	}
}
