package com.eee22.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eee22.dao.IDaoPhone;
import com.eee22.model.ModelPhone;

@Service("servicePhone")
public class ServicePhone implements IServicePhone {
    // SLF4J Logging
    private static Logger logger = LoggerFactory.getLogger(ServicePhone.class);
    
    
    @Autowired
    @Qualifier("daoPhone")
    IDaoPhone dao ;
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        ModelPhone result = null;
        try {
            result = dao.getPhoneOne(name);
        } catch (Exception e) {
            logger.error("getPhoneOne" + e.getMessage() );
            throw e;
        }
        return result;
    }
    
    @Override
    public List<ModelPhone> getPhoneList() {
        List<ModelPhone> result = null;
        try{
            result = dao.getPhoneList();
        } catch (Exception e) {
            logger.error("insertPhone" + e.getMessage() );
        }
        return result;
    }
    
    @Override
    public int insertPhone(ModelPhone phone) {
        int result = -1;
        try {
            result = dao.insertPhone(phone);
        }catch (Exception e){
            logger.error("insertPhone" + e.getMessage() );
        }
        return  result;
    }
    
    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        
        int result = -1;
        
        try {
            result = dao.insertPhoneList(phones);
        }catch (Exception e){
            logger.error("insertPhoneList" + e.getMessage() );
        }
        return  result;
    }
}
