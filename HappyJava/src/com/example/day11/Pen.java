package com.example.day11;

import java.util.Objects;

public class Pen {
    String color;

    public Pen(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "pen";
    }

    //SetExam에서 Pen타입의 Set에 중복값 허용을 막기위해 정의한다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
