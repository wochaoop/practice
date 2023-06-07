package com.PracticalTraining.N4;
import java.util.Calendar;

public class Task1 {
        public static void main(String[] args) {
            String idCard = "362301200203041017";
            int age = getAgeByIdCard(idCard);
            System.out.println("年龄是：" + age);
        }

        public static int getAgeByIdCard(String idCard) {
            int age = 0;
            try {
                int year = Integer.parseInt(idCard.substring(6, 10));
                int month = Integer.parseInt(idCard.substring(10, 12));
                int day = Integer.parseInt(idCard.substring(12, 14));

                Calendar calendar = Calendar.getInstance();
                int nowYear = calendar.get(Calendar.YEAR);
                int nowMonth = calendar.get(Calendar.MONTH) + 1;
                int nowDay = calendar.get(Calendar.DAY_OF_MONTH);

                age = nowYear - year;
                if (nowMonth < month || (nowMonth == month && nowDay < day)) {
                    age--;
                }
            } catch (Exception e) {
                // 身份证号码格式不正确，出现异常
                e.printStackTrace();
            }
            return age;
        }
    }

