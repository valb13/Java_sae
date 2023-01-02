package org.example;

import Exploitation.API.Generable;
import Exploitation.Lib.Exploitation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {


        Exploitation exploitation = new Exploitation();
        exploitation.Migration();

    }
}