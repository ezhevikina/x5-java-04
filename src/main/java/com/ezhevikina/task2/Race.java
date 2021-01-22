package com.ezhevikina.task2;

import java.util.concurrent.CountDownLatch;

public class Race {

  //Условная длина гоночной трассы
  private static final int trackLength = 500000;

  public static void main(String[] args) throws InterruptedException {
    CountDownLatch latch = new CountDownLatch(5);
    CountDownLatch start = new CountDownLatch(1);

    for (int i = 1; i <= 5; i++) {
      new Thread(new Car(i, (int) (Math.random() * 100 + 50), latch, start)).start();
      Thread.sleep(1000);
    }

    System.out.println("На старт!");
    Thread.sleep(1000);
    System.out.println("Внимание!");
    Thread.sleep(1000);
    System.out.println("Марш!");
    start.countDown();
  }

  public static class Car implements Runnable {
    private int carNumber;
    private int carSpeed; //считаем, что скорость автомобиля постоянная
    private CountDownLatch latch;
    private CountDownLatch start;

    public Car(int carNumber, int carSpeed, CountDownLatch latch, CountDownLatch start) {
      this.carNumber = carNumber;
      this.carSpeed = carSpeed;
      this.latch = latch;
      this.start = start;
    }

    @Override
    public void run() {
      try {
        System.out.printf("Автомобиль №%d подъехал к стартовой прямой.\n", carNumber);
        latch.countDown();
        latch.await();
        start.await();
        Thread.sleep(trackLength / carSpeed); //ждем пока проедет трассу
        System.out.printf("Автомобиль №%d финишировал!\n", carNumber);
      } catch (InterruptedException e) {
      }
    }
  }
}
