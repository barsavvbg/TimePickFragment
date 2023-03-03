package ru.synergy.timepickerdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // Устанавливаем текущее время для TimePicker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Создаём TimePickerDialog и возвращаем его
        Dialog picker = new TimePickerDialog(getActivity(), this, hour, minute, true);
        picker.setTitle(getResources().getString(R.string.choose_time));

        return picker;
    }

    @Override
    public void onStart() {
        super.onStart();
        // Добавляем пользовательский текст для кнопки
        Button nButton =((AlertDialog)
        getDialog()).getButton(DialogInterface.BUTTON_POSITIVE);
        nButton.setText(getResources().getString(R.string.ready));
    }
    @Override
    public void onTimeSet(TimePicker view, int hours, int minute) {
        // Выводим выбранное время
        TextView tv = (TextView) getActivity().findViewById(R.id.tv);
        tv.setText(getResources().getString(R.string.hours) + hours + getResources().getString(R.string.minutes) + minute);

    }
}
