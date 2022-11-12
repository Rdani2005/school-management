package com.rdani2005.model;

import com.rdani2005.swing.table.EventAction;
import com.rdani2005.swing.table.ModelAction;
import com.rdani2005.swing.table.ModelProfile;
import java.text.DecimalFormat;
import javax.swing.Icon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ModelStudent {
    private Icon icon;
    private String name;
    private String gender;
    private String course;
    private double fees;

    public Object[] toRowTable(EventAction event) {
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        return new Object[]{new ModelProfile(icon, name), gender, course, df.format(fees), new ModelAction(this, event)};
    }
}
