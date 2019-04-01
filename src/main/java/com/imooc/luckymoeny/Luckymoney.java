package com.imooc.luckymoeny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import javax.persistence.*;
/**
 * Created with IntelliJ IDEA.
 * User: DengChen
 * Date: 2019/4/1
 * Time: 14:44
 * code change the world
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Luckymoney {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private BigDecimal money;

    //发送发
    private String producer;

    //接收方
    private String consumer;

}
