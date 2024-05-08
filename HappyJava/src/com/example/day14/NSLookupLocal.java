package com.example.day14;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookupLocal {

    public static void main(String[] args) {
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println(localAddress.getHostName());
            System.out.println(localAddress.getHostAddress());

            System.out.println("byte[] 형식의 ip 주소 변환 ");
            byte[] ip = localAddress.getAddress();
            for (int i = 0; i < ip.length; i++) {
                System.out.println(ip[i] & 0xFF);
                if (i != ip.length - 1)
                    System.out.println(".");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        try{
            InetAddress address = InetAddress.getByName("www.naver.com");
            System.out.println(address.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
