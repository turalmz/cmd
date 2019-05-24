/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runapp;

import java.io.IOException;

/**
 *
 * @author muzaffarlit
 */
public class RunApp {

    public static void main(String[] args) throws IOException {
        Process runtime = Runtime.getRuntime().exec("cmd /c python manage.py runserver");
    }
    
}
