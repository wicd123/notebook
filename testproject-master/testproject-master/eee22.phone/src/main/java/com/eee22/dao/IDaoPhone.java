package com.eee22.dao;

import java.util.List;


import com.eee22.model.ModelPhone;

public interface IDaoPhone {
    ModelPhone getPhoneOne(String name);
    List<ModelPhone> getPhoneList();
    int insertPhone(ModelPhone phone);
    int insertPhoneList(List<ModelPhone>phones);
}
