package panda.domain.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "packages")
public class Package extends BaseEntity{
    //•	Has an Id – a UUID String or an Integer.
    //•	Has a Description – a string.
    //•	Has a Weight – a floating-point number.
    //•	Has a Shipping Address – a string.
    //•	Has a Status – can be one of the following values (“Pending”, “Shipped”, “Delivered”, “Acquired”)
    //•	Has an Estimated Delivery Date – A LocalDateTime object.
    //•	Has a Recipient – a User object.
    private String description;
    private Double weight;
    private String shippingAddress;
    private Status status;
    private LocalDateTime estimatedDeliveryDate;
    private User recipient;

    public Package() {
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return this.description;
    }

    @Column(name = "weight", nullable = false)
    public Double getWeight() {
        return this.weight;
    }

    @Column(name = "shipping_address", nullable = false)
    public String getShippingAddress() {
        return this.shippingAddress;
    }
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    public Status getStatus() {
        return this.status;
    }

    @Column(name = "estimated_delivery_time")
    public LocalDateTime getEstimatedDeliveryDate() {
        return this.estimatedDeliveryDate;
    }

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "recipient_id", referencedColumnName = "id")
    public User getRecipient() {
        return this.recipient;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
}
