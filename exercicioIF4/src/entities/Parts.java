package entities;

public class Parts {

	private Integer id;
	private Double price;
	private Integer quantity;

//--------

	public Parts() {
		
	}
	
	public Parts(Integer id, Double price, Integer quantity) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}
	
	
//--------
	
	public Integer getiId() {
		return id;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
}
