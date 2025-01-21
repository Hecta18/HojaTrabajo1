public interface IBlender {
    void turnOn();
    void turnOff();
    void fill(String content);
    void empty();
    void increaseSpeed();
    void decreaseSpeed();
    int getSpeed();
    boolean isFilled();
}