/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiNhacDTO;
import ENTITY.Loainhac;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 *
 * @author Quoc Dat
 */
public class LoaiNhacDAO {
    private EntityManager entityManager;
    
    public LoaiNhacDTO addLNDAO(String name){
    
        LoaiNhacDTO loaiNhac = getDichVuByName(name);
        if(null!=loaiNhac){
            return null;           
        }
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("QLNhacPU");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        //entityManager.createNamedQuery("");
        Loainhac lnEntity = new Loainhac(name);        
        entityManager.persist(lnEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
//        System.out.println(getDichVuByName(name).getName());
        return getDichVuByName(name);
//        return null;
    }
    public LoaiNhacDTO xoaLNDAO(String name){
        LoaiNhacDTO lnDTO =  getDichVuByName(name);
        Loainhac ln = new Loainhac(lnDTO.getId(),lnDTO.getName());
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("QLNhacPU");
        entityManager = entityManagerFactory.createEntityManager();        
        entityManager.getTransaction().begin();        
        if(null!=ln){
            ln=entityManager.merge(ln);
            entityManager.remove(ln);
            entityManager.getTransaction().commit();
        }
        
        entityManager.close();
        return lnDTO;
    }
    public LoaiNhacDTO getDichVuByName(String name){
        try{
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("QLNhacPU");
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Query q = entityManager.createNamedQuery("Loainhac.findByName",Loainhac.class);
            q.setParameter("name", name);
            Loainhac ln = (Loainhac) q.getSingleResult();
            entityManager.getTransaction().commit();
            entityManager.close();            
            
            LoaiNhacDTO lnDTO = new LoaiNhacDTO(ln.getId(),ln.getName());
            return lnDTO;
        }
        catch(Exception ex){
            entityManager.close();
            System.out.println("sai roi");
            return null;
        }
        
    }
    
}
