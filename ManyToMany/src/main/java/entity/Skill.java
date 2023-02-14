package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table(name="skill")
public class Skill {
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;

	@ManyToMany
    @JoinTable( name = "skill_user_association",
			    joinColumns = @JoinColumn( name = "id_skill" ),
			    inverseJoinColumns = @JoinColumn( name = "id_user" ) )
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Skill() {
		super();
	}
	
	
}
