package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void serviceClass() {
        SQRService service = new SQRService();
        int expected =3;
        int actual = service.serviceClass(200,300);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void serviceClass1() {
        SQRService service = new SQRService();
        int expected =3;
        int actual = service.serviceClass(300,400);
        assertEquals(expected,actual);
    }
}