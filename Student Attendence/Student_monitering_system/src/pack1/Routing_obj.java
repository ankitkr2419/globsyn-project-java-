package pack1;

import java.io.Serializable;

public class Routing_obj implements Serializable{
	private String id;
	private String period;
	private String mrout;
	private String trout;
	private String wrout;
	private String throut;
	private String frout;
	
	public Routing_obj(String id,String period, String mrout, String trout, String wrout, String  throut, String frout) {
		// TODO Auto-generated constructor stub
		super();
		this.id =id;
		this.period=period;
		this.mrout= mrout;
		this.trout =trout;
		this.wrout =wrout;
		this.throut =throut;
		this.frout = frout;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getMrout() {
		return mrout;
	}

	public void setMrout(String mrout) {
		this.mrout = mrout;
	}

	public String getTrout() {
		return trout;
	}

	public void setTrout(String trout) {
		this.trout = trout;
	}

	public String getWrout() {
		return wrout;
	}

	public void setWrout(String wrout) {
		this.wrout = wrout;
	}

	public String getThrout() {
		return throut;
	}

	public void setThrout(String throut) {
		this.throut = throut;
	}

	public String getFrout() {
		return frout;
	}

	public void setFrout(String frout) {
		this.frout = frout;
	}

	
	

}
