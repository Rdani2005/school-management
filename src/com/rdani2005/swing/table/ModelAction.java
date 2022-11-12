package com.rdani2005.swing.table;

import com.rdani2005.model.ModelStudent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ModelAction {
    private ModelStudent student;
    private EventAction event;
}
