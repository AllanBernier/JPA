package intro.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name="product")
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String name ;
	
	private String price ;
		
	@OneToOne
	@JoinColumn(name="id_product_details", nullable=false)
	private ProductDetails productDetails;

	public Product() {
		super();
	}

	public Product(String name, String price, ProductDetails productDetails) {
		super();
		this.name = name;
		this.price = price;
		this.productDetails = productDetails;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public ProductDetails getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}


/**
credential(
	id

	login,
	password	
)


account (
	id

	first_name,
	last_name,
	DATE date_creation,
	nombre_messages_envoyees
	nombre_amis

	credentials_id references credential(id)
)


> GET by id
> GET ALL

> CREATE

> UPDATE

> DELETE by id
 */



















