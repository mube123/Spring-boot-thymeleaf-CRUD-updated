package com.example.themeleaf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;
    
    @NotBlank(message = "Gender is mandatory")
    private String gender;
    
    @NotBlank(message = "Hobby is mandatory")
    private String hobby;

    public User() {}

    public User(String name, String email,String gender,String hobby) 
    {
        this.name = name;
        this.email = email;
        this.email = gender;
        this.email = hobby;
    }

    public void setId(long id) 
    {
        this.id = id;
    }
    
    public long getId() 
    {
        return id;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public void setHobby(String hobby) 
    {
        this.hobby = hobby;
    }

    public String getName() 
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }
    
    public String getGender() 
    {
        return gender;
    }
    
    public String getHobby() 
    {
        return hobby;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", hobby=" + hobby
				+ "]";
	}

	

    
}