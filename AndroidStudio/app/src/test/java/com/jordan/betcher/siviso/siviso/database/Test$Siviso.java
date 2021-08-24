package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertEquals;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$Siviso
{
	@Test
	public void latLng_01_01()
	{
		String name = "";
		LatLng latLng = new LatLng(0, 1);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		
		Siviso siviso = new Siviso(name, latLng, radius, ringmode);
		
		LatLng actualLatLng = siviso.latLng();
		assertEquals(latLng, actualLatLng);
	}
	
	@Test
	public void latLng_00_00()
	{
		String name = "";
		LatLng latLng = new LatLng(0, 0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		
		Siviso siviso = new Siviso(name, latLng, radius, ringmode);
		
		LatLng actualLatLng = siviso.latLng();
		assertEquals(latLng, actualLatLng);
	}
}