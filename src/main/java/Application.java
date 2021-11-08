//horo  = args [0] - знак гороскопа

import java.util.Random; //импортируем из пакета java.util класс Random

public class Application {
    public static void main(String[] args) {
        String horo = args[0];
        if (args[0].equals("Овен")) {

            System.out.println(aries());//выводим на экран результат метода aries
        }

        if (args[0].equals("Телец")) {

            System.out.println(taurus());//выводим на экран результат метода taurus
        }

        if (args[0].equals("Близнецы")) {

            System.out.println(gemini());//выводим на экран результат метода gemini
        }

        if (args[0].equals("Раки")) {
            System.out.println(cancer());//выводим на экран результат метода cancer
        }

        if (args[0].equals("Лев")) {
            System.out.println(leo());//выводим на экран результат метода leo
        }

        if (args[0].equals("Дева")) {
            System.out.println(virgo());//выводим на экран результат метода Virgo
        }

        if (args[0].equals("Весы")) {
            System.out.println(libra());//выводим на экран результат метода Libra
        }

        if (args[0].equals("Скорпион")) {
            System.out.println(scorpio());//выводим на экран результат метода Scorpio
        }

        if (args[0].equals("Стрелец")) {
            System.out.println(sagottarius());
        }

        if (args[0].equals("Козерог")) {
            System.out.println(capricorn());
        }

        if (args[0].equals("Водолей")) {
            System.out.println(aquarius());
        }

        if (args[0].equals("Рыба")) {
            System.out.println(pisces());
        }
    }
    public static String aries (){
        Random randomAries = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] aries = new String[2];//создаем массив для добавления вариантов гороскопа
        aries[0] = "Вы Овен, ваш гороскоп на сегодня - 1";
        aries[1] = "Вы Овен, ваш гороскоп на сегодня - 2";
        index = randomAries.nextInt(2);
        return aries[index];
    }

    public static String taurus (){
        Random randomTaurus = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] taurus = new String[2];//создаем массив для добавления вариантов гороскопа
        taurus[0] = "Вы Телец, ваш гороскоп на сегодня - 1";
        taurus[1] = "Вы Телец, ваш гороскоп на сегодня - 2";
        index = randomTaurus.nextInt(2);
        return taurus[index];
    }

    public static String gemini (){
        Random randomGemini = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] gemini = new String[2];//создаем массив для добавления вариантов гороскопа
        gemini[0] = "Вы Близнецы, ваш гороскоп на сегодня - 1";
        gemini[1] = "Вы Близнецы, ваш гороскоп на сегодня - 2";
        index = randomGemini.nextInt(2);
        return gemini[index];
    }

    public static String cancer (){
        Random randomCancer = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] cancer = new String[2];//создаем массив для добавления вариантов гороскопа
        cancer[0] = "Вы Рак, ваш гороскоп на сегодня - 1";
        cancer[1] = "Вы Рак, ваш гороскоп на сегодня - 2";
        index = randomCancer.nextInt(2);
        return cancer[index];
    }

    public static String leo (){
        Random randomLeo = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] leo = new String[2];//создаем массив для добавления вариантов гороскопа
        leo[0] = "Вы Лев, ваш гороскоп нe сегодня - 1";
        leo[1] = "Вы Лев, ваш гороскоп на сегодня - 2";
        index = randomLeo.nextInt(2);
        return leo[index];
    }

    public static String virgo (){
        Random randomVirgo = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] virgo = new String[2];//создаем массив для добавления вариантов гороскопа
        virgo[0] = "Вы Дева, ваш гороскоп нe сегодня - 1";
        virgo[1] = "Вы Дева, ваш гороскоп на сегодня - 2";
        index = randomVirgo.nextInt(2);
        return virgo[index];
    }

    public static String libra (){
        Random randomLibra = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] libra = new String[2];//создаем массив для добавления вариантов гороскопа
        libra[0] = "Вы Весы, ваш гороскоп нe сегодня - 1";
        libra[1] = "Вы Весы, ваш гороскоп на сегодня - 2";
        index = randomLibra.nextInt(2);
        return libra[index];
    }

    public static String scorpio (){
        Random randomScorpio = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] scorpio = new String[2];//создаем массив для добавления вариантов гороскопа
        scorpio[0] = "Вы Скорпион, ваш гороскоп нe сегодня - 1";
        scorpio[1] = "Вы Скорпион, ваш гороскоп на сегодня - 2";
        index = randomScorpio.nextInt(2);
        return scorpio[index];
    }

    public static String sagottarius (){
        Random randomSagottarius = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] sagottarius = new String[2];//создаем массив для добавления вариантов гороскопа
        sagottarius[0] = "Вы Стрелец, ваш гороскоп нe сегодня - 1";
        sagottarius[1] = "Вы Стрелец, ваш гороскоп на сегодня - 2";
        index = randomSagottarius.nextInt(2);
        return sagottarius[index];
    }

    public static String capricorn (){
        Random randomCapricorn = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] capricorn = new String[2];//создаем массив для добавления вариантов гороскопа
        capricorn[0] = "Вы Козерог, ваш гороскоп нe сегодня - 1";
        capricorn[1] = "Вы Козерог, ваш гороскоп на сегодня - 2";
        index = randomCapricorn.nextInt(2);
        return capricorn[index];
    }

    public static String aquarius (){
        Random randomAquarius = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] aquarius = new String[2];//создаем массив для добавления вариантов гороскопа
        aquarius[0] = "Вы Водолей, ваш гороскоп нe сегодня - 1";
        aquarius[1] = "Вы Водолей, ваш гороскоп на сегодня - 2";
        index = randomAquarius.nextInt(2);
        return aquarius[index];
    }

    public static String pisces (){
        Random randomPisces = new Random();//создаем объект типа Random с именем randomAries
        int index; //объявляем переменную index типа int для использования с методом nextIn и получения случайного значения
        String[] pisces = new String[2];//создаем массив для добавления вариантов гороскопа
        pisces[0] = "Вы Рыба, ваш гороскоп нe сегодня - 1";
        pisces[1] = "Вы Рыба, ваш гороскоп на сегодня - 2";
        index = randomPisces.nextInt(2);
        return pisces[index];
    }
}
