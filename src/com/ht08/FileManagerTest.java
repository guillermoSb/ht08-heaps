package com.ht08;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void readFileTest() {
        Vector<Paciente> real = new Vector();
        real.add(new Paciente ("Buttowski", "Pierna rota","C"));
        real.add(new Paciente ("Garfield", "Dolor de estomago","D"));
        real.add(new Paciente ("Tom", "Fractura multiple interna","A"));

        Vector<Paciente> test = new Vector<>();
        test = FileManager.readFile("paciente.txt");
        assertTrue(real.get(0).getNombre().equals(test.get(1).getNombre()));
        assertTrue(real.get(1).getNombre().equals(test.get(4).getNombre()));
        assertTrue(real.get(2).getNombre().equals(test.get(6).getNombre()));
    }
}