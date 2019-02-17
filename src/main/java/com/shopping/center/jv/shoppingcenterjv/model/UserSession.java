package com.shopping.center.jv.shoppingcenterjv.model;

import java.util.Date;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class UserSession extends BaseEntity{

    private String status;
    private String description;
    private Date startSession;
    private Date endSession;

}
