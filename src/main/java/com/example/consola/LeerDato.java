package com.example.consola;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Iterator;

public class LeerDato {
    @FXML
    private TextField resultado;
    private ArrayList<Integer> numeros = new ArrayList<>();
    @FXML
    private TextField numero;
    private Suma suma =new Suma();
    @FXML
    public void btnAgregar(){
        numeros.add(Integer.parseInt(numero.getText()));
    }
    @FXML
    public void btnSuma(){
       resultado.setText(suma.suma(numeros)+"");
       numeros.clear();
    }
    @FXML
    public void btnSalir(){
        System.exit(0);
    }
}