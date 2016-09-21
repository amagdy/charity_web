package com.a1works.data.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Case extends AbstractEntity {

    private String name;
    private Boolean isSick;
    private double monthlyIncome;
    private String description;
    private int familyMembersCount;
    private String location;


    @ManyToOne
    private ContactPerson contactPerson;

    @OneToMany
    private List<Donation> donations;

    @ManyToMany
    private Set<Requirement> requirements;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSick() {
        return isSick;
    }

    public void setSick(Boolean sick) {
        isSick = sick;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFamilyMembersCount() {
        return familyMembersCount;
    }

    public void setFamilyMembersCount(int familyMembersCount) {
        this.familyMembersCount = familyMembersCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Requirement> getRequirements() {
        return requirements;
    }

    public void addRequirement(Requirement requirement) {
        if (requirement == null) {
            throw new IllegalArgumentException("Added requirement cannot be Null.");
        }
        if (requirements == null) {
            requirements = new HashSet<>();
        }
        requirements.add(requirement);
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public List<Donation> getDonations(){
        return donations;
    }

    public void addDonation(Donation donation){
        if (donation == null) {
            throw new IllegalArgumentException("Added donation cannot be Null.");
        }
        if (donations == null) {
            donations = new ArrayList<>();
        }
        donations.add(donation);
    }

}
