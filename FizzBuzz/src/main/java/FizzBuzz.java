public class FizzBuzz {
    public static void main(String[] args) {
        MyCounter myCounter = new MyCounter(25);
        ThreadA threadA = new ThreadA(myCounter);
        ThreadB threadB = new ThreadB(myCounter);
        ThreadC threadC = new ThreadC(myCounter);
        ThreadD threadD = new ThreadD(myCounter);
        new Thread(threadA,"ThA").start();
        new Thread(threadB,"ThB").start();
        new Thread(threadC,"ThC").start();
        new Thread(threadD,"ThD").start();

    }


}



