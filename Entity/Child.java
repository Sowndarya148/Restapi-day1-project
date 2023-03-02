package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="Child")
public class Child {
	@Id
	@Column(name="babyId")
	
	private int babyId;
	
	@Column(name="babyFirstName")
	
	private String babyFirstName;
	
	@Column(name="babyLastName")
	
	private String babyLastName;
	
	@Column(name="fatherName")
	
	private String fatherName;
	
	@Column(name="motherName")
	
	private String motherName;
	
	@Column(name="Address")
	
	private String address;
	
	 public int getbabyId()
	    {
	    	return babyId;
	    }
	    public void setbabyId(int id)
	    {
	    	this.babyId=id;
	    }
	    public String getbabyFirstName()
	    {
	    	return babyFirstName;
	    }
	    public void setbabyFirstName(String name)
	    {
	    	this.babyFirstName=name;
	    }
	    public String getbabyLastName()
	    {
	    	return babyLastName;
	    }
	    public void setbabyLastName(String name)
	    {
	    	this.babyLastName=name;
	    }
	    public String getfatherName()
	    {
	    	return fatherName;
	    }
	    public void setfatherName(String name)
	    {
	    	this.fatherName=name;
	    }
	    public String getmotherName()
	    {
	    	return motherName;
	    }
	    public void setMotherName(String name)
	    {
	    	this.motherName=name;
	    }
	    public String getaddress()
	    {
	    	return address;
	    }
	    public void setaddress(String name)
	    {
	    	this.address=name;
	    }
	    public Child()
	    {
	    	
	    }
	
	
	
}
