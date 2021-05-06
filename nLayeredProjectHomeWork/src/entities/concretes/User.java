package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity
{
	private int Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private String BirthDay;
	private boolean verification;
	
	public User() {}
	
	public User(int Id,String FirstName,String LastName,String Email,String Password,
			String BirthDay) 
	{
		this.Id=Id;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Email=Email;
		this.Password=Password;
		this.BirthDay=BirthDay;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}

	public boolean isVerification() {
		return verification;
	}

	public void setVerification(boolean verification) {
		this.verification = verification;
	}
}
