/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package token;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MuhammadTaufik
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List ar = new ArrayList();
        RandomToken rt = new RandomToken();
        String token = rt.getToken();
        rt.addToken(ar, token);
        rt.viewToken(ar);
    }
}
