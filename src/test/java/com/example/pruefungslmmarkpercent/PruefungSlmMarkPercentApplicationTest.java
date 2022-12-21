package com.example.pruefungslmmarkpercent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruefungSlmMarkPercentApplicationTest {
    @Test
    void testMarkOne(){
        // A -- Arange Erzeugen der Klasse
        var controller = new PruefungSlmMarkPercentApplication();

        // A -- Act Aufrufen der Methode
        var result  = controller.GetMarkFromPercentage("95");

        // A -- Assert Vergleich ob das Ergebnis der Erwartung entspricht
        assertEquals("1", result);
    }

    @Test
    void testMarkTwo(){
        var controller = new PruefungSlmMarkPercentApplication();
        var result  = controller.GetMarkFromPercentage("80");
        assertEquals("2", result);
    }

    @Test
    void testMarkThree(){
        var controller = new PruefungSlmMarkPercentApplication();
        var result  = controller.GetMarkFromPercentage("70");
        assertEquals("3", result);
    }

    @Test
    void testMarkFour(){
        var controller = new PruefungSlmMarkPercentApplication();
        var result  = controller.GetMarkFromPercentage("60");
        assertEquals("4", result);
    }

    @Test
    void testMarkFive(){
        var controller = new PruefungSlmMarkPercentApplication();
        var result  = controller.GetMarkFromPercentage("40");
        assertEquals("5", result);
    }
}