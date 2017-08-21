package com.eee22.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.eee22.model.ModelPhone;
@Repository("daoPhone")
public class DaoPhone implements IDaoPhone {
    
    private static Logger logger = LoggerFactory.getLogger(DaoPhone.class);
    
    @Autowired
    
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        return session.selectOne("mapper.mysql.mapperPhone.getPhoneOne",name);
    }
    
    @Override
    public List<ModelPhone> getPhoneList() {
        // TODO Auto-generated method stub
        return session.selectList("mapper.mysql.mapperPhone.getPhoneList");
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        // TODO Auto-generated method stub
        return session.insert("mapper.mysql.mapperPhone.insertPhone", phone);
    }

    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        // TODO Auto-generated method stub
        return session.insert("mapper.mysql.mapperPhone.insertPhoneList", phones);
    }
}