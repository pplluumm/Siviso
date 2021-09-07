package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSivisoSelect_OnViewHolderInit_HighlightAndScrollTo
implements OnSivisoSelect, OnViewHolderInit
{
	int indexOfSelectedSiviso = -1;
	private LinearLayoutManager linearLayoutManager;
	private HighlightView highlightView;
	
	public OnSivisoSelect_OnViewHolderInit_HighlightAndScrollTo(LinearLayoutManager linearLayoutManager, HighlightView highlightView)
	{
		this.linearLayoutManager = linearLayoutManager;
		this.highlightView = highlightView;
	}
	
	@Override
	public void onSivisoSelect(int indexOfSiviso)
	{
		indexOfSelectedSiviso = indexOfSiviso;
		View view = linearLayoutManager.findViewByPosition(indexOfSiviso + 1);
		if(isVisible(view))
		{
			highlightView.highlight(view);
		}
		else
		{
			linearLayoutManager.scrollToPosition(indexOfSiviso + 1);
		}
	}
	
	private boolean isVisible(View view)
	{
		return view != null;
	}
	
	@Override
	public void bindingView(int indexOfView, ViewHolder_Abstract viewHolder)
	{
		if(indexOfSelectedSiviso != -1 && indexOfView == indexOfSelectedSiviso + 1)
		{
			highlightView.highlight(viewHolder.background());
		}
	}
}