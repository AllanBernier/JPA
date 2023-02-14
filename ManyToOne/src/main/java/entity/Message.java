package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="message")
public class Message {
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinataire;
	
	private String message;
	
    @ManyToOne  
    @JoinTable( name = "message_user_association",
			    joinColumns = @JoinColumn( name = "id_user" ),
			    inverseJoinColumns = @JoinColumn( name = "id_message" ) )
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Message(int id, String destinataire, String message, User user) {
		super();
		this.id = id;
		this.destinataire = destinataire;
		this.message = message;
		this.user = user;
	}

	public Message() {
		super();
	}

	public Message(String destinataire, String message, User user) {
		super();
		this.destinataire = destinataire;
		this.message = message;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", destinataire=" + destinataire + ", message=" + message + "]";
	}
    
    
    
    
    
}
