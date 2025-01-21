public class Blender implements IBlender {
    private boolean isOn;
    private boolean isFilled;
    private int speed;
    private String content;

    public Blender() {
        this.isOn = false;
        this.isFilled = false;
        this.speed = 0;
        this.content = "";
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Blender turned on.");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            speed = 0;
            System.out.println("Blender turned off.");
        }
    }

    @Override
    public void fill(String content) {
        if (!isFilled) {
            this.content = content;
            this.isFilled = true;
            System.out.println("Blender filled with: " + content);
        }
    }

    @Override
    public void empty() {
        if (isFilled) {
            this.content = "";
            this.isFilled = false;
            System.out.println("Blender emptied.");
        }
    }

    @Override
    public void increaseSpeed() {
        if (isOn && isFilled && speed < 10) {
            speed++;
            System.out.println("Speed increased to: " + speed);
        } else if (!isOn) {
            System.out.println("Turn on the blender first.");
        } else if (!isFilled) {
            System.out.println("Fill the blender first.");
        } else {
            System.out.println("Speed is already at maximum.");
        }
    }

    @Override
    public void decreaseSpeed() {
        if (isOn && speed > 0) {
            speed--;
            System.out.println("Speed decreased to: " + speed);
        } else {
            System.out.println("Speed is already at minimum.");
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean isFilled() {
        return isFilled;
    }
}