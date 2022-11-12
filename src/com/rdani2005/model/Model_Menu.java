package com.rdani2005.model;

import javax.swing.Icon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model_Menu {


    public Model_Menu(Icon icon, String menuName, String... subMenu) {
        this.icon = icon;
        this.menuName = menuName;
        this.subMenu = subMenu;
    }

    private Icon icon;
    private String menuName;
    private String subMenu[];
}
