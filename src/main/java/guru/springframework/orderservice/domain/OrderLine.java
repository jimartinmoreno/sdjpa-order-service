package guru.springframework.orderservice.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Objects;

/**
 * Created by jt on 12/14/21.
 */
@Entity
public class OrderLine extends BaseEntity {

    private Integer quantityOrdered;

    @ManyToOne
    private OrderHeader orderHeader;

    @ManyToOne
    private Product product;

    public Integer getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Integer quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderLine)) return false;
        if (!super.equals(o)) return false;
        OrderLine orderLine = (OrderLine) o;
        return Objects.equals(getQuantityOrdered(),
                orderLine.getQuantityOrdered()) && Objects.equals(getOrderHeader(), orderLine.getOrderHeader()) && Objects.equals(getProduct(), orderLine.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                getQuantityOrdered(), getProduct());
    }


    /**
     * PRECAUCION CON EL HASHCODE y las referencias circulares
     */
}
