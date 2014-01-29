package com.springwhisper.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springwhisper.models.RequestFormat;
import com.springwhisper.modles.ResultFormat;
import com.xosdigital.tcx.domain.Assets;


public class AssetsDaoImpl {
    @Autowired
    SessionFactory sessionFactory;
    
    public List<Assets> getAssets(RequestFormat request, ResultFormat resultFormat) {
        List<Assets> result = null;
        //TODO
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(Assets.class);
        if(request.getFirstResult() != -1) {
            crit.setFirstResult(request.getFirstResult());
        }
        
        if(request.getFetchSize() > 0) {
            crit.setFetchSize(request.getFetchSize());
        }
        
        return result;
    }

}
