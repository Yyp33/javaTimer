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
		timer.schedule(new MyTask(), 3000,5000);//������ڣ����������3����У��������һ�������Ժ�ÿ��5����ظ��Ľ���һ��
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = dateFormat.parse("2018-02-08 17:20:00");
		timer.scheduleAtFixedRate(new MyTask(), date, 5000);//���������Ӧ��ʱ����ɺ�ÿ��5���ظ��Ľ���һ��
	}
}
