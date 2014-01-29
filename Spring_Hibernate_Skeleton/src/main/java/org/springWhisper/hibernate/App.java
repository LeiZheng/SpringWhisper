package org.springWhisper.hibernate;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Session;

import com.xosdigital.tcx.domain.Assets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.createAndStoreEvent();
        List<Assets> result = app.listAssets();
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writeValueAsString(result));
            
        } catch (JsonGenerationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private void createAndStoreEvent() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Assets assetItem = new Assets();
        assetItem.setVaid("name1");
        assetItem.setXaid(UUID.randomUUID().toString());
        session.save(assetItem);
        session.getTransaction().commit(); 
    }
    
    private List listAssets() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List result = session.createQuery("from Assets").list();
        session.getTransaction().commit();
        return result;
    }
}
