package com.jordan.betcher.siviso.siviso.map;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Matchers.notNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady_Multiple
{
	@Test
	public void addOnMapReady__notNull()
	{
		OnMapReady onMapReady = mock(OnMapReady.class);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_Multiple multiple = new OnMapReady_Multiple();
		multiple.add(onMapReady);
		multiple.onMapReady(googleMap);
		
		verify(onMapReady, times(0)).ready(null);
	}
	
	@Test
	public void addAddOnMapReady_onMapReady1_ready()
	{
		OnMapReady onMapReady1 = mock(OnMapReady.class);
		OnMapReady onMapReady2 = mock(OnMapReady.class);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_Multiple multiple = new OnMapReady_Multiple();
		multiple.add(onMapReady1);
		multiple.add(onMapReady2);
		multiple.onMapReady(googleMap);
		
		verify(onMapReady1, times(1)).ready(googleMap);
	}
	
	@Test
	public void onMapReadyAdd__ready()
	{
		OnMapReady onMapReady = mock(OnMapReady.class);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_Multiple multiple = new OnMapReady_Multiple();
		multiple.onMapReady(googleMap);
		multiple.add(onMapReady);
		
		verify(onMapReady, times(1)).ready(googleMap);
	}
	
	@Test
	public void addOnMapReady__ready()
	{
		OnMapReady onMapReady = mock(OnMapReady.class);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_Multiple multiple = new OnMapReady_Multiple();
		multiple.add(onMapReady);
		multiple.onMapReady(googleMap);
		
		verify(onMapReady, times(1)).ready(googleMap);
	}
}