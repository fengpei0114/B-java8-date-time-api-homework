package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int nextLaborYear = date.getMonthValue() >= 5 ? date.getYear() + 1 : date.getYear();
    LocalDate nextLabor = LocalDate.of(nextLaborYear, 5, 1);
    return nextLabor.toEpochDay() - date.toEpochDay();
  }
}
