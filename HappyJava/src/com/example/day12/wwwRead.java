package com.example.day12;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class wwwRead {
    public static void main(String[] args){
        try{
            URL url = new URL("https://techit.education/?utm_source=google&utm_medium=ggl_sa&utm_campaign=THECHIT_google_sa&utm_content=brandGroup&utm_term=%ED%83%9C%ED%82%B7&gclid=CjwKCAjww_iwBhApEiwAuG6ccGOJ2b53iv3sAiDZwTsgLtHrK1BHOOopQbTSSYMPpSZeDVx7OqumYBoCl-8QAvD_BwE");
            InputStream urlInput = url.openStream();
            try(BufferedReader bw = new BufferedReader(new InputStreamReader(urlInput));
                PrintWriter pw = new PrintWriter("src/com/example/day12/text/url.txt")) {
                String str = null;
                while((str = bw.readLine()) != null){
                    System.out.println(str);
                    pw.println(str);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
