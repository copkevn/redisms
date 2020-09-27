package com.hey.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: Order
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:20
 * @Description: Description
 * @Version: 1.0
 */
@Data
@Table(name = "t_order")
public class Order implements Serializable {
    private static final long serialVersionUID = -8867272732777764701L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "order_name")
    private String order_name;
    @Column(name = "order_user")
    private String order_user;
}

