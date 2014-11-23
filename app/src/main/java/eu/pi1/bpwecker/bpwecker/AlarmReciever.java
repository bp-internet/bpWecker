package eu.pi1.bpwecker.bpwecker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReciever extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        // TODO Auto-generated method stub
        Toast.makeText(context, "Alarm! Alarm! Alarm! Alarm! Alarm!", Toast.LENGTH_LONG).show();

        //new UrlContent("http://192.168.1.10/s/100/100");

        context.startService(new Intent(context, MyAlarmService.class));
    }

}