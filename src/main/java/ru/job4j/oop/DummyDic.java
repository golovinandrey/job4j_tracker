package ru.job4j.oop;

public class DummyDic {

    public String engToRus() {
        String eng = "Скальпель";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus();
        System.out.println("Неизвестное слово " + say);
    }
}
