package com.hey.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: Stock
 * @Author: HeYong
 * @Date: 2020-09-27/0027 17:23
 * @Description: Description
 * @Version: 1.0
 */
@Data
@Table(name = "stock")
public class Stock implements Serializable {
    private static final long serialVersionUID = 2451194410162873075L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "stock")
    private Long  stock;
}

