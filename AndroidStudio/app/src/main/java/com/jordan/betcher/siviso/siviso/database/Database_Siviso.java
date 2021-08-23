package com.jordan.betcher.siviso.siviso.database;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Database_Siviso implements Database
{
	public static final String SIVISOS_ID = "sivisosId";
	static final String DEFAULT_RINGMODE_ID = "defaultRingmodeId";
	static final String SHARED_PREFERENCES_ID = "sharedPreferencesID";
	private SharedPreferences sharedPreferences;
	private Factory_SivisoFromString sivisoFromString;
	private RingmodeConverter ringmodeConverter;
	
	public Database_Siviso(
	Activity activity, RingmodeConverter ringmodeConverter,
	Factory_SivisoFromString sivisoFromString)
	{
		this.ringmodeConverter = ringmodeConverter;
		sharedPreferences = activity.getSharedPreferences(SHARED_PREFERENCES_ID, Context.MODE_PRIVATE);
		this.sivisoFromString = sivisoFromString;
	}
	
	@Override
	public Ringmode defaultRingmode()
	{
		int ringmodeInt = sharedPreferences.getInt(DEFAULT_RINGMODE_ID, 0);
		Ringmode ringmode = ringmodeConverter.ringmodeFrom(ringmodeInt);
		return ringmode;
	}
	
	@Override
	public void setDefaultRingmode(Ringmode ringmode)
	{
		SharedPreferences.Editor editor1 = sharedPreferences.edit();
		SharedPreferences.Editor editor2 = editor1.putInt(DEFAULT_RINGMODE_ID, ringmode.ordinal());
		editor2.apply();
	}
	
	@Override
	public int count()
	{
		return 0;
	}
	
	@Override
	public ArrayList<Siviso> sivisos()
	{
		String sivisoString1 = sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "").replaceAll("[{}]","");
		Siviso siviso = sivisoFromString.siviso(sivisoString1);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso);
		return sivisos;
	}
	
	@Override
	public void setRingmode(int sivisoIndex, int ringmodeIndex)
	{
	
	}
	
	@Override
	public LatLng sivisoLatLng(int index)
	{
		return null;
	}
	
	@Override
	public void saveNewSiviso(
	PossibleSiviso possibleSiviso)
	{
	
	}
	
	@Override
	public void delete(LatLng selected)
	{

	}
}
