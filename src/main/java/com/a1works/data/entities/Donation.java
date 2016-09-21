package com.a1works.data.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Donation extends AbstractEntity{

    private int amount;
    private Boolean processed;
    private Date createdAt;

    @ManyToOne
    private Case aCase;

    @ManyToOne
    private Doner doner;

    @ManyToOne
    private Requirement requirement;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Boolean getProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Doner getDoner() {
        return doner;
    }

    public void setDoner(Doner doner) {
        this.doner = doner;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
}
