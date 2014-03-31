package it.essepuntato.lode;

import java.io.IOException;

/**
 * Created by Filipe_2 on 30/03/2014.
 */
public class Main {

    public static void main(String args[]) {

        LodeServlet ls = new LodeServlet();
        try {
            ls.doGet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
