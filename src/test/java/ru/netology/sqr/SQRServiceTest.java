package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    void numberSquares() {
        SQRService service = new SQRService();

        int actual = service.bruteForce(200, 300);

        assertEquals(3, actual);

    }
}
