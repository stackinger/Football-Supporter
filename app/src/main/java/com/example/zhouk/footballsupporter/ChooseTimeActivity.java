package com.example.zhouk.footballsupporter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zhouk.footballsupporter.base.BaseActivity;

import android.support.v4.app.DialogFragment;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.DatePickerDialog;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.DatePicker;
import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;


public class ChooseTimeActivity extends BaseActivity{
    private final int requestCode = 1500;
    private static final String TAG = "SKYWANG";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_time);

        setTitle("确定球场租赁时间");
        setBackBtn();

        ToFieldList();
    }

    // "时间"按钮onClick
    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public static class TimePickerFragment extends DialogFragment
            implements TimePickerDialog.OnTimeSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            Log.d(TAG, "hour:"+hourOfDay+", minute: "+minute);
        }
    }

    // “日期”按钮onClick
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            Log.d(TAG, "year:"+year+", month: "+month+", day:"+day);
        }
    }


    /*
    * 确认按钮跳转到球场列表
    * */
    protected void ToFieldList(){
        button = (Button) findViewById(R.id.ct_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "足球场添加成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ChooseTimeActivity.this, FieldListActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是ChooseTimeActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);
            }
        });

    }


}
