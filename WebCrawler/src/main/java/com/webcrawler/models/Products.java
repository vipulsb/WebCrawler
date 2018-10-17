package com.webcrawler.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Sameer Gaware
 *
 */

@XmlRootElement(name = "products")
@XmlAccessorType (XmlAccessType.FIELD)
public class Products {

	@XmlElement(name = "product")
	List<Product> products = null;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
