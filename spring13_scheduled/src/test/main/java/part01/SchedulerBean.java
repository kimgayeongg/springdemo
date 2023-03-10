package part01;


import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class SchedulerBean {
    private static final Logger logger = LoggerFactory.getLogger(SchedulerBean.class);
    
    @Scheduled(cron="0/3 * * * * *")
    public void scheduleRun() {
    	Calendar calendar = Calendar.getInstance();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	logger.info("�����ٸ� ����:" + sdf.format(calendar.getTime()));
    	System.out.println("System:" + sdf.format(calendar.getTime()));
    }
}


/* CRON �����ٷ� ���� ǥ����
 * 1. 7���� �� �ʵ�� �����Ǿ� ����
 *   ��(Seconds) ��(Minutes) ��(Hours) ��(Day) ��(Month) ����(Week) ����(Year)
 *   
 *     �ʵ��       ���� ������     		 ���� Ư������
 *   ��(Seconds)     0~59         		  , - * /
 *   ��(Minutes)     0~59          		  , - * /
 *   ��(Hours)       0~23           		  , - * /
 *   ��(Day)         1~31           		  , - * ? / L W
 *   ��(Month)       1~12 or JAN ~DEC     , - * /
 *   ����(Week)       0~6 or SUN~SAT       , - * ? / L #
 *   ����(Year)      empty or 1970~2099    , - * /
 *   
 *  
 *   <cron ǥ���� - Ư������ �ǹ�>
�� * : ��� ���� ǥ��.
�� ? : Ư���� ���� ������ ǥ��. 
�� - : ������ �ǹ�. (��) �����Ͽ��� �����ϱ����� MON-WED�� ǥ��
�� , : Ư���� ���� ���� ���� (��) ��,��,�� MON,WED,FRI 
�� / : ���۽ð� / ����  (��) 0�к��� �� 5�� 0/5
�� L : �Ͽ��� ����ϸ� ������ ��, ���Ͽ����� ������ ����(�����)
�� W : ���� ����� ���� (��) 15W�� 15�Ͽ��� ���� ����� ���� (�� ~ ��)�� ã��
�� # : ��°���� ���� ������ ǥ�� (��) 3#2 : 2��°�� ������
 *   
 * cron="0/3 * * * * *" => 3�ʸ���
 * cron="0 0/5 * * * *" => 5�и���
 * cron="0 * 12 * *  *"  => ���� �� 12�ÿ�
 * cron="0 15 10 * * *" => ���� 10�� 15�п�
 * cron="0 15 10 * * * 2022" => 2022�� ���ȸ� ���� 10�� 15�п�
 * cron="0 0/50 9-17 * * MON-FRI  => �����Ϻ��� �ݿ��ϱ���(����) 9�� ���� 17�� ���� �� 50�и��� 
 * cron="0 0 0 1 1 * *" => �س� 1�� 1�� 0�ø���
 * cron="0 15 10 15 * *" => �ſ� 15�� ���� 10�� 15�и���
 * cron="0 15 10 L * * "  => �ſ� ���� ���� 10�� 15�и���
 * cron="0 15 10 * * 6L => �ſ� ������ �ݿ��� ���� 10�� 15�и���
 * cron="0 15 10 * * 6L 2020-2022 => 2020����� 2022����� �ſ� ������ �ݿ��� 10�� 15�и��� 
 * cron="0 0   9 10 * *  => �ſ� 10�� 9�ø���
 * 
 * 2. cron ����ǥ���� 
 * http://www.cronmaker.com/?0
 */





