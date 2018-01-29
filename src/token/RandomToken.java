/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package token;

import java.util.List;
import java.util.Random;

/**
 *
 * @author MuhammadTaufik
 */
public class RandomToken {
    
    public String getToken() {
        String alphnum = "ABCDEFGHIJKLMNOPQRSTUVXYZ1234567890abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder();
        Random rd = new Random();
        while (sb.length() < 6) {
            int i =(int) (rd.nextFloat()*(alphnum.length()));
            sb.append(alphnum.charAt(i));
        }
        String token = sb.toString();
        return token;
    }
    
    public void addToken(List tk, String token){
        tk.add(token);
    }
    
    public void viewToken(List tk){
        tk.forEach((token -> System.out.println(token)));
    }

}
