package com.sheryians.major.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

//@Entity
//@Table(name="users")
public class User {

	public User(Integer id, @NotEmpty String firstName, String lastName,
			@NotEmpty @Email(message = "{errors.invalid_email}") String email, @NotEmpty String password,
			List<Role> roles) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty
	@Column(nullable=false)
	private String firstName;
	
	private String lastName;
	
	@NotEmpty
	@Column(nullable=false, unique=true)
	@Email(message="{errors.invalid_email}")
	private String email;
	
	@NotEmpty
	private String password;
	
	@ManyToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	@JoinTable(
			name="user_role", 
			joinColumns= {@JoinColumn(name="USER_ID", referencedColumnName="ID")}, 
			inverseJoinColumns = {@JoinColumn(name="ROLE_ID", referenceColumnName="ID")}
			)
	private List<Role> roles;
}
