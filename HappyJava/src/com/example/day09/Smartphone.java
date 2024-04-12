package com.example.day09;

public class Smartphone {
    public interface Camere {
        void takePhoto();
    }

    public class BasicCamera implements Camere {
        @Override
        public void takePhoto() {
            System.out.println("사진을 찍습니다.");
        }
    }

    public void activateCamera() {
        Camere camere = new BasicCamera();
        camere.takePhoto();
    }
}
