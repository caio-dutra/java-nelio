package entities;

public class Product {
	
	private String name;
	private Double price;
	private Integer unit;
	
	public Product() {
	}

	public Product(String name, Double price, Integer unit) {
		this.name = name;
		this.price = price;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	
	public Double total() {
		return unit * price;
	}

}
