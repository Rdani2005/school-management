package com.rdani2005.swing.noticeboard;

import java.awt.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ModelNoticeBoard {
    private Color titleColor;
    private String title;
    private String time;
    private String descripcion;    
}
