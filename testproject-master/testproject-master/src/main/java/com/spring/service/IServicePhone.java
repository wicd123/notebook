package com.spring.service;

import java.util.List;

import com.spring.dao.IDaoPhone;
import com.spring.model.ModelPhone;

public interface IServicePhone extends IDaoPhone {
    List<ModelPhone> getPhoneList();
}
