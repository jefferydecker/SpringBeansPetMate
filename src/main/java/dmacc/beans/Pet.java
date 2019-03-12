package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
	private String name;
	private String owner;
	private Boolean isfemale;
	private Boolean isfertile;
	
	public Pet() {
		super();
		this.isfemale = true;
		this.isfertile = true;
	}

	public Pet(String name) {
		super();
		this.name = name;
		this.isfemale = true;
		this.isfertile = true;
	}

	public Pet(String type, String name, String owner) {
		super();
		this.type = type;
		this.name = name;
		this.owner = owner;
		this.isfemale = true;
		this.isfertile = true;
	}

	public Pet(String type, String name,
			String owner, Boolean isfemale, Boolean isfertile) {
		super();
		this.type = type;
		this.name = name;
		this.owner = owner;
		this.isfemale = isfemale;
		this.isfertile = isfertile;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Boolean getIsfemale() {
		return isfemale;
	}

	public void setIsfemale(Boolean isfemale) {
		this.isfemale = isfemale;
	}

	public Boolean getIsfertile() {
		return isfertile;
	}

	public void setIsfertile(Boolean isfertile) {
		this.isfertile = isfertile;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", type=" + type + ", name=" + name + ", owner="
			+ owner + ", isfemale=" + isfemale + ", isfertile=" + isfertile + "]";
	}


}
