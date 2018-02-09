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
//		timer.schedule(new MyTask(), 3000,5000);//程序启动后，3秒运行，然后每隔5秒运行一次
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = dateFormat.parse("2018-02-09 10:11:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timer.scheduleAtFixedRate(new MyTask(), date, 5000);//程序启动后到设定的日期时刻启动，然后每隔5秒重复执行一次
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		timer.cancel();//关闭定时器
	}

	
}
