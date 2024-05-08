package com.example.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class UDPEchoClient {
    public static void main(String[] args) {
        try(DatagramSocket clientSocket = new DatagramSocket();
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));){
            //서버의 주소 설정
            InetAddress IpAddress = InetAddress.getByName("localhost");
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            //키보드로 입력 받기
            System.out.println("보낼 메시지를 입력 하세요::");
            String msg = keyboard.readLine();

            //서버로 보내기
            DatagramPacket sendPocket = new DatagramPacket(msg.getBytes(), msg.getBytes().length, IpAddress, 8888);
            clientSocket.send(sendPocket);

            //서버로 부터 받기
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String receiveMessage = new String(receivePacket.getData());

            System.out.println(receiveMessage);

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
