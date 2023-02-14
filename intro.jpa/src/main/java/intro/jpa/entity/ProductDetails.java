package intro.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name ="product_details")
public class ProductDetails {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String description;
    private String fournisseur;
    private int stock;
    
    @OneToOne(mappedBy = "productDetails")
    private Product product;
    
    
    public void setProduct(Product product) {
		this.product = product;
	}
    
    public Product getProduct() {
		return product;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public ProductDetails() {
		super();
	}
	public ProductDetails(String description, String fournisseur, int stock) {
		super();
		this.description = description;
		this.fournisseur = fournisseur;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", description=" + description + ", fournisseur=" + fournisseur + ", stock="
				+ stock + "]";
	}
	
}
