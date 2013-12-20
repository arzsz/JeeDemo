package com.example.jeedemo.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

import com.example.jeedemo.domain.Camera;

@Stateless
public class CameraMenager {

	@PersistenceContext
	EntityManager entity;
	
	public void addCamera(Camera camera) {
        camera.setId(null);
        entity.persist(camera);
}

@SuppressWarnings("unchecked")
public List<Camera> getAllGasnice(){
        return entity.createNamedQuery("camera.getAllCamera").getResultList();
}
}
