package designpatterns.builder;

//Product
public class Actor {
	private String type; 
	private String sex; 
	private String face; 
	private String costume; 
	private String hairstyle; 
	
	public void setType(String type) {
		this.type = type; 
	}

	public void setSex(String sex) {
		this.sex = sex; 
	}

	public void setFace(String face) {
		this.face = face; 
	}

	public void setCostume(String costume) {
		this.costume = costume; 
	}

	public void setHairstyle(String hairstyle) {
		this.hairstyle = hairstyle; 
	}

	public String getType() {
		return (this.type); 
	}

	public String getSex() {
		return (this.sex); 
	}

	public String getFace() {
		return (this.face); 
	}

	public String getCostume() {
		return (this.costume); 
	}

	public String getHairstyle() {
		return (this.hairstyle); 
	}
}
