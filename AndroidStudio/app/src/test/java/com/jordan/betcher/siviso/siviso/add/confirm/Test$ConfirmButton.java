package com.jordan.betcher.siviso.siviso.add.confirm;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.Button;

import org.junit.Test;

public class Test$ConfirmButton
{
	@Test
	public void _buttonSaveData_setOnClickSaveData()
	{
		Button button = mock(Button.class);
		OnClick_SaveSivisoData saveData = mock(OnClick_SaveSivisoData.class);
		
		ConfirmButton confirmButton = new ConfirmButton(button, saveData);
		
		verify(button, times(1)).setOnClickListener(saveData);
	}
}