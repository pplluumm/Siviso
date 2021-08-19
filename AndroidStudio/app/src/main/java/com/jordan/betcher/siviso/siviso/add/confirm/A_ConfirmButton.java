package com.jordan.betcher.siviso.siviso.add.confirm;

import android.widget.Button;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;
import com.jordan.betcher.siviso.siviso.add.PossibleSivisoData;
import com.jordan.betcher.siviso.siviso.database.Database;

public class A_ConfirmButton
{
	//TODO
	public A_ConfirmButton(
	A_Activity_Add activity, PossibleSivisoData possibleSivisoData,
	Database database)
	{
		Button button = activity.findViewById(R.id.buttonConfirm);
		OnClick_SaveSivisoData saveData = new OnClick_SaveSivisoData(database, possibleSivisoData);
		ConfirmButton confirmButton = new ConfirmButton(button, saveData);
		OnComplete_EnableButton enableButton = new OnComplete_EnableButton(confirmButton);
		possibleSivisoData.onComplete(enableButton);
	}
}