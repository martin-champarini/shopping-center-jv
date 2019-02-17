package com.shopping.center.jv.shoppingcenterjv.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = "userSession")
public class User {

    @Id
    private String username;

    private String password;

    @OneToOne
    @JoinColumn(name = "id")
    private UserSession userSession;
}
