
package Assignment8;


abstract class Phone {
    abstract void call();
    abstract void sms();
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
    
    @Override
    void call() {
        System.out.println("Making a phone call...");
    }

    @Override
    void sms() {
        System.out.println("Sending an SMS...");
    }
      
    @Override
    public void click() {
        System.out.println("Clicking a photo...");
    }
    
    @Override
    public void record() {
        System.out.println("Recording a video...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }
    
    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }
}

public class Que6 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.call();
        s1.sms();
        Camera c1 = new SmartPhone();
        c1.click ();
        c1.record();
        MusicPlayer m1 = new SmartPhone();
        m1.play();
        m1.pause();
        m1.stop();
    }
}