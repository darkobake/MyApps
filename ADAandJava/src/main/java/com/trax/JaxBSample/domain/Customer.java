package com.trax.JaxBSample.domain;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by SG0220142 on 7/19/2014.
 */
@XmlRootElement
@Getter@Setter
public class Customer {
    private String name;
    private int age;
    private int id;
}
