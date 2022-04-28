package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message){
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public Error(){
        this.active = true;
        this.status = 12;
        this.message = "restart system";
    }

    public void info() {
        System.out.println("active is: " + active);
        System.out.println("status is: " + status);
        System.out.println("message is: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.info();
        System.out.println();
        Error error1 = new Error(false, 0, "all ok");
        error1.info();
        System.out.println();
        Error error2 = new Error(true, 22, "off system");
        error2.info();
    }
}
