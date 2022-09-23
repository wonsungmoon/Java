package src.example.generics;

public class Point<T, V> {
    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    } //제네릭 메서드

    public V getY() {
        return y;
    } //제네릭 메서드
}