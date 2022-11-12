package com.rdani2005.model;

import javax.swing.Icon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Model_Card {
    private String title;
    private double values;
    private int percentage;
    private Icon icon;
}
