package com.emeldi.demo.user;

import com.emeldi.demo.validation.FieldMatch;
import com.emeldi.demo.validation.ValidEmail;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@FieldMatch.List({ @FieldMatch(first = "password", second = "matchingPassword", message = "The password fields must match") })
public class CrmUser {

	@NotNull(message = "* required")
	@Size(min = 1, message = "* required")
	private String userName;

	@NotNull(message = "* required")
	@Size(min = 1, message = "* required")
	private String password;
	
	@NotNull(message = "* required")
	@Size(min = 1, message = "* required")
	private String matchingPassword;

	@NotNull(message = "* required")
	@Size(min = 1, message = "* required")
	private String firstName;

	@NotNull(message = "* required")
	@Size(min = 1, message = "* required")
	private String lastName;

	@ValidEmail
	@NotNull(message = "* required")
	@Size(min = 1, message = "* required")
	private String email;

	public CrmUser()
	{
		//
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getMatchingPassword()
	{
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword)
	{
		this.matchingPassword = matchingPassword;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}
