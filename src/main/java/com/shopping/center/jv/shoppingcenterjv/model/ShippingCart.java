package com.shopping.center.jv.shoppingcenterjv.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class ShippingCart extends BaseEntity{

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
     private User user;

    @OneToMany(mappedBy = "shippingCart", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> products;

    private Date orderDate;
}
