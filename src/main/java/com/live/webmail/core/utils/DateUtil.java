package com.live.webmail.core.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author kevin
 * @version Revision: 1.00 Date: 10-12-28下午5:54
 * @Email liuyuhui007@gmail.com
 */
public class DateUtil {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date todayStartTime = getTodayStartTime();
        Date todayEndTime = getTodayEndTime();
        System.out.println("最近一天开始时间:" + sdf.format(todayStartTime));
        System.out.println("最近一天结束时间:" + sdf.format(todayEndTime));

        Date currentWeekStartTime = getThisWeekStartTime();
        Date currentWeekEndTime = getThisWeekEndTime();
        System.out.println("本周开始时间:" + sdf.format(currentWeekStartTime));
        System.out.println("本周结束时间:" + sdf.format(currentWeekEndTime));

        Date thisMonthStartTime = getThisMonthStartTime();
        Date thisMonthEndTime = getThisMonthEndTime();
        System.out.println("本月开始时间:" + sdf.format(thisMonthStartTime));
        System.out.println("本月结束时间:" + sdf.format(thisMonthEndTime));

        Date thisThreeMonthStartTime = getThisThreeMonthStartTime();
        System.out.println("最近三个月开始时间:" + sdf.format(thisThreeMonthStartTime));
        System.out.println("最近三个月结束时间:" + sdf.format(thisMonthEndTime));

        Date thisYearStartTime = getThisYearStartTime();
        Date thisYearEndTime = getThisYearEndTime();
        System.out.println("最近一年开始时间:" + sdf.format(thisYearStartTime));
        System.out.println("最近一年结束时间:" + sdf.format(thisYearEndTime));
    }

    /**
     * 最近一天开始时间
     * 今天是2010-12-29，则开始时间是2010-12-29 00:00:00 结束是 2010-12-29 23:59:59
     */
    public static Date getTodayStartTime() {
        Calendar cal = Calendar.getInstance();
        changeStartTime(cal);
        return cal.getTime();
    }

    /**
     * 最近一天结束时间
     * 今天是2010-12-29，则开始时间是2010-12-29 00:00:00 结束是 2010-12-29 23:59:59
     */
    public static Date getTodayEndTime() {
        Calendar cal = Calendar.getInstance();
        changeEndTime(cal);
        return cal.getTime();
    }

    /**
     * 本周开始时间
     * 今天是2010-12-29，则本周开始时间是2010-12-27 00:00:00 结束是 2010-12-29 23:59:59
     */
    public static Date getThisWeekStartTime() {
        Calendar cal = Calendar.getInstance();
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK) - 2;
        cal.add(Calendar.DATE, -day_of_week);
        changeStartTime(cal);
        return cal.getTime();
    }

    /**
     * 本周开始时间
     * 今天是2010-12-29，则本周开始时间是2010-12-27 00:00:00 结束是 2010-12-29 23:59:59
     */
    public static Date getThisWeekEndTime() {
        Calendar cal = Calendar.getInstance();
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK) - 2;
        cal.add(Calendar.DATE, -day_of_week);
        cal.add(Calendar.DATE, 6);
        changeEndTime(cal);
        return cal.getTime();
    }

    /**
     * 本月开始时间
     * 今天是2010-12-29，则本月开始时间是2010-12-01 00:00:00 结束是 2010-12-31 23:59:59
     */
    public static Date getThisMonthStartTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        changeStartTime(cal);
        return cal.getTime();
    }

    /**
     * 本月结束时间
     * 今天是2010-12-29，则本月开始时间是2010-12-01 00:00:00 结束是 2010-12-31 23:59:59
     */
    public static Date getThisMonthEndTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        changeEndTime(cal);
        return cal.getTime();
    }

    /**
     * 最近三个月的开始时间
     * 今天是2010-12-29，则最近三个月开始时间是2010-10-01 00:00:00 结束是当月月底 2010-12-31 23:59:59
     */
    public static Date getThisThreeMonthStartTime() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -2);    //月份减2
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        changeStartTime(cal);
        return cal.getTime();
    }

    /**
     * 最近一年的开始时间
     * 今天是2010-12-29，则最近三个月开始时间是2010-01-01 00:00:00 结束是当月月底 2010-12-31 23:59:59
     */
    public static Date getThisYearStartTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_YEAR, cal.getActualMinimum(Calendar.DAY_OF_YEAR));
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        changeStartTime(cal);
        return cal.getTime();
    }

    /**
     * 最近一年的结束时间
     * 今天是2010-12-29，则最近三个月开始时间是2010-01-01 00:00:00 结束是当月月底 2010-12-31 23:59:59
     */
    public static Date getThisYearEndTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_YEAR, cal.getActualMaximum(Calendar.DAY_OF_YEAR));
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        changeEndTime(cal);
        return cal.getTime();
    }

    /**
     * 将日历时间设置为yyyy-MM-dd 00:00:00
     */
    public static void changeStartTime(Calendar cal) {
        cal.set(Calendar.HOUR_OF_DAY, 00);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
    }

    /**
     * 将日历时间设置为yyyy-MM-dd 23:59:59
     */
    public static Calendar changeEndTime(Calendar cal) {
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal;
    }
}
