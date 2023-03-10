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
    	logger.info("스케줄링 실행:" + sdf.format(calendar.getTime()));
    	System.out.println("System:" + sdf.format(calendar.getTime()));
    }
}


/* CRON 스케줄러 정규 표현식
 * 1. 7개의 각 필드로 구성되어 있음
 *   초(Seconds) 분(Minutes) 시(Hours) 일(Day) 월(Month) 요일(Week) 연도(Year)
 *   
 *     필드명       값의 허용범위     		 허용된 특수문자
 *   초(Seconds)     0~59         		  , - * /
 *   분(Minutes)     0~59          		  , - * /
 *   시(Hours)       0~23           		  , - * /
 *   일(Day)         1~31           		  , - * ? / L W
 *   월(Month)       1~12 or JAN ~DEC     , - * /
 *   요일(Week)       0~6 or SUN~SAT       , - * ? / L #
 *   연도(Year)      empty or 1970~2099    , - * /
 *   
 *  
 *   <cron 표현식 - 특수문자 의미>
● * : 모든 값을 표현.
● ? : 특정한 값이 없음을 표현. 
● - : 범위를 의미. (예) 월요일에서 수요일까지는 MON-WED로 표현
● , : 특별한 값일 때만 동작 (예) 월,수,금 MON,WED,FRI 
● / : 시작시간 / 단위  (예) 0분부터 매 5분 0/5
● L : 일에서 사용하면 마지막 일, 요일에서는 마지막 요일(토요일)
● W : 가장 가까운 평일 (예) 15W는 15일에서 가장 가까운 평일 (월 ~ 금)을 찾음
● # : 몇째주의 무슨 요일을 표현 (예) 3#2 : 2번째주 수요일
 *   
 * cron="0/3 * * * * *" => 3초마다
 * cron="0 0/5 * * * *" => 5분마다
 * cron="0 * 12 * *  *"  => 매일 낮 12시에
 * cron="0 15 10 * * *" => 매일 10시 15분에
 * cron="0 15 10 * * * 2022" => 2022년 동안만 매일 10시 15분에
 * cron="0 0/50 9-17 * * MON-FRI  => 월요일부터 금요일까지(주중) 9시 부터 17시 까지 매 50분마다 
 * cron="0 0 0 1 1 * *" => 해년 1월 1일 0시마다
 * cron="0 15 10 15 * *" => 매월 15일 오전 10시 15분마다
 * cron="0 15 10 L * * "  => 매월 말일 오전 10시 15분마다
 * cron="0 15 10 * * 6L => 매월 마지막 금요일 오전 10시 15분마다
 * cron="0 15 10 * * 6L 2020-2022 => 2020년부터 2022년까지 매월 마지막 금요일 10시 15분마다 
 * cron="0 0   9 10 * *  => 매월 10일 9시마다
 * 
 * 2. cron 정규표현식 
 * http://www.cronmaker.com/?0
 */





