package timer;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import task.MyTask;

public class TimerDemo {
	
	public static void main(String[] args) throws ParseException{
		Timer timer = new Timer();
		timer.schedule(new MyTask(), 3000,5000);//任务会在，启动程序后3秒进行，进行完第一次任务以后每隔5秒后重复的进行一次
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = dateFormat.parse("2018-02-08 17:20:00");
		timer.scheduleAtFixedRate(new MyTask(), date, 5000);//任务会在相应的时间完成后，每隔5秒重复的进行一次
	}
}
