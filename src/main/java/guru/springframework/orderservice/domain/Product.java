package guru.springframework.orderservice.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;

@Entity
public class Product extends BaseEntity {

    private String description;

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return Objects.equals(getDescription(), product.getDescription()) && getProductStatus() == product.getProductStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDescription(), getProductStatus());
    }
}
