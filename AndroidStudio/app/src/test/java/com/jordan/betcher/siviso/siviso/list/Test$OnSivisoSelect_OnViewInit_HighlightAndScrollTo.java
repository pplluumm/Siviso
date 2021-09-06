package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

import org.junit.Test;

public class Test$OnSivisoSelect_OnViewInit_HighlightAndScrollTo
{
	@Test
	public void onSivisoSelect_1ViewNull_Selected1()
	{
		int indexOfSiviso = 1;
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		int indexOfSivisoView = indexOfSiviso + 1;
		when(linearLayoutManager.findViewByPosition(indexOfSivisoView)).thenReturn(view);
		
		OnSivisoSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnSivisoSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSivisoSelect(indexOfSiviso);
		
		int selected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(indexOfSiviso, selected);
	}
	
	@Test
	public void onSivisoSelect_0ViewNull_Selected0()
	{
		int indexOfSiviso = 0;
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		int indexOfSivisoView = indexOfSiviso + 1;
		when(linearLayoutManager.findViewByPosition(indexOfSivisoView)).thenReturn(view);
		
		OnSivisoSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnSivisoSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSivisoSelect(indexOfSiviso);
		
		int selected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(indexOfSiviso, selected);
	}
	
	@Test
	public void onSivisoSelect_0View_0ScrollTo()
	{
		int indexOfSiviso = 0;
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		int indexOfSivisoView = indexOfSiviso + 1;
		when(linearLayoutManager.findViewByPosition(indexOfSivisoView)).thenReturn(view);
		
		OnSivisoSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnSivisoSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSivisoSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(0)).scrollToPosition(anyInt());
	}
	
	
	@Test
	public void onSivisoSelect_1ViewNull_ScrollTo2()
	{
		int indexOfSiviso = 1;
		HighlightView highlightView = mock(HighlightView.class);
		int scrollToPosition = 2;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		int indexOfSivisoView = indexOfSiviso + 1;
		when(linearLayoutManager.findViewByPosition(indexOfSivisoView)).thenReturn(view);
		
		OnSivisoSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnSivisoSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSivisoSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(1)).scrollToPosition(scrollToPosition);
	}
	
	@Test
	public void onSivisoSelect_0ViewNull_ScrollTo1()
	{
		int indexOfSiviso = 0;
		HighlightView highlightView = mock(HighlightView.class);
		int scrollToPosition = 1;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		when(linearLayoutManager.findViewByPosition(indexOfSiviso)).thenReturn(view);
		
		OnSivisoSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnSivisoSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSivisoSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(1)).scrollToPosition(scrollToPosition);
	}
	
	@Test
	public void __selectedSivisoNegative1()
	{
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		
		OnSivisoSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnSivisoSelect_OnViewInit_HighlightAndScrollTo(layoutManager, highlightView);
		
		int actualSelected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(-1, actualSelected);
	}
}