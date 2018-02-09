package timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import task.MyTask;



public class TimerDemo_web implements ServletContextListener {

	Timer timer = null;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		timer = new Timer();
//		timer.schedule(new MyTask(), 3000,5000);//����������3�����У�Ȼ��ÿ��5������һ��
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = dateFormat.parse("2018-02-09 10:11:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timer.scheduleAtFixedRate(new MyTask(), date, 5000);//�����������趨������ʱ��������Ȼ��ÿ��5���ظ�ִ��һ��
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		timer.cancel();//�رն�ʱ��
	}

	
}
