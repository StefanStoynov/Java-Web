package panda.domain.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "receipts")
public class Receipt extends BaseEntity{

    private BigDecimal fee;
    private LocalDateTime issuedOn;
    private User recipient;
    private Package aPackage;

    public Receipt() {
    }
    @Column(name = "fee", nullable = false)
    public BigDecimal getFee() {
        return this.fee;
    }
    @Column(name = "issued_on", nullable = false)
    public LocalDateTime getIssuedOn() {
        return this.issuedOn;
    }

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "recipient_id", referencedColumnName = "id")
    public User getRecipient() {
        return this.recipient;
    }

    @OneToOne(targetEntity = Package.class)
    @JoinColumn(name = "package_id", referencedColumnName = "id")
    public Package getaPackage() {
        return this.aPackage;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public void setIssuedOn(LocalDateTime issuedOn) {
        this.issuedOn = issuedOn;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
