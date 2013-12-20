package com.example.jeedemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jeedemo.domain.Camera;
import com.example.jeedemo.service.CameraMenager;

@SessionScoped
@Named("cameraBean")
public class CameraFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Camera camera = new Camera();
	private ListDataModel<Camera> cameras = new ListDataModel<Camera>();

	@Inject
	CameraMenager cameramenager;

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	// Actions
	public String addCamera() {
		cameramenager.addCamera(camera);
		return "showCamera";
		// return null;
	}

	public ListDataModel<Camera> getAllGasnice() {
		cameras.setWrappedData(cameramenager.getAllGasnice());
		return cameras;
	}
}