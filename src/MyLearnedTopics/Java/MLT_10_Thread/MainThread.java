package MyLearnedTopics.Java.MLT_10_Thread;

import MyLearnedTopics.Java.MLT_10_Thread.MultiThread.Multithread;

public class MainThread {
    public static void main(String[] args) {

        System.out.println("Program Starting......\n\n");

        // Creating Object of Multithread
        Multithread thread1 = new Multithread();
        thread1.start();
    }
}
