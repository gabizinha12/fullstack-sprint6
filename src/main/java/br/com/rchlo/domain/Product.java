package br.com.rchlo.domain;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

public class Product  implements Comparable<Product>{

    private final Long code;
    private final String name;
    private final String description;
    private final String slug;
    private final String brand;
    private final BigDecimal price;
    private final BigDecimal discount;
    private final Color color;
    private final Integer weightInGrams;
    private final String image;
    private final Set<Size> availableSizes;

    public Product(Long code, String name, String description, String slug, String brand, BigDecimal price, BigDecimal discount, Color color, Integer weightInGrams, String image, Set<Size> availableSizes) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.slug = slug;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
        this.color = color;
        this.weightInGrams = weightInGrams;
        this.image = image;
        this.availableSizes = availableSizes;
    }

    public Long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSlug() {
        return slug;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public Color getColor() {
        return color;
    }

    public Integer getWeightInGrams() {
        return weightInGrams;
    }

    public String getImage() {
        return image;
    }

    public Set<Size> getAvailableSizes() {
        return availableSizes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return Objects.equals(code, product.code);
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", slug='" + slug + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", color=" + color +
                ", weightInGrams=" + weightInGrams +
                ", image='" + image + '\'' +
                ", availableSizes=" + availableSizes +
                '}';
    }

	@Override
	public int compareTo(Product product) {
	return this.code.compareTo(product.getCode());
	}

	
}
