//horo  = args [0] - знак гороскопа

import java.util.Random; //импортируем из пакета java.util класс Random

public class Application {
    public static void main(String[] args) {
        String horo = args[0];
        if (args[0].equals("Овен")) {

            System.out.println(aries());//выводим на экран результат метода aries
        }

        if (args[0].equals("Телец")) {
            System.out.println(aries());//выводим на экран результат метода aries
        }

        if (args[0].equals("Близнецы")) {
            System.out.println(aries());//выводим на экран результат метода aries
        }

        if (args[0].equals("Раки")) {
            System.out.println("Уверен, что вы Рак");
        }

        if (args[0].equals("Лев")) {
            System.out.println("Сразу видно, что Вы царь зверей");
        }

        if (args[0].equals("Дева")) {
            System.out.println("Дева, это отличный знак зодиака");
        }

        if (args[0].equals("Весы")) {
            System.out.println("Весы, это отличный знак зодиака");
        }

        if (args[0].equals("Скорпион")) {
            System.out.println("Я случайно узнал, что Вы Скорпион");
        }

        if (args[0].equals("Стрелец")) {
            System.out.println("Не зря Вы стрелец по гороскопу, с меткостью у Вас проблем нет");
        }

        if (args[0].equals("Козерог")) {
            System.out.println("Слышал, что Козероги очень щедрые");
        }

        if (args[0].equals("Водолей")) {
            System.out.println("Я случайно узнал, что Вы Водолей");
        }

        if (args[0].equals("Рыба")) {
            System.out.println("Рыба, это отличный знак зодиака");
        }
    }
    public static String aries (){
        Random randomAries = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] aries = new String[2];//создаем массив для добавления вариантов гороскопа
        aries[0] = "Вы Овен ваш гороскоп на сегодня - 1";
        aries[1] = "Вы Овен ваш гороскоп на сегодня - 2";
        index = randomAries.nextInt(2);
        return aries[index];
    }

    public static String taurus (){
        Random randomTaurus = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] taurus = new String[2];//создаем массив для добавления вариантов гороскопа
        taurus[0] = "Вы Телец ваш гороскоп на сегодня - 1";
        taurus[1] = "Вы Телец ваш гороскоп на сегодня - 2";
        index = randomTaurus.nextInt(2);
        return taurus[index];
    }

    public static String gemini (){
        Random randomGemini = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] gemini = new String[2];//создаем массив для добавления вариантов гороскопа
        gemini[0] = "Вы Близнецы ваш гороскоп на сегодня - 1";
        gemini[1] = "Вы Близнецы ваш гороскоп на сегодня - 2";
        index = randomGemini.nextInt(2);
        return gemini[index];
    }
}
