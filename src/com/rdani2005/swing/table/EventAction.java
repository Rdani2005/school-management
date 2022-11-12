package com.rdani2005.swing.table;

import com.rdani2005.model.ModelStudent;

public interface EventAction {

    public void delete(ModelStudent student);

    public void update(ModelStudent student);
}
