# CREATE AND START THREADS

This an activity from concurrent programming

## Activity

We have two people using a shared bank account at the same time. Create and start
two threads using the same instance of the bank account and a starting balance of $ 1000.00. A
thread will deposit $ 300.00 to the bank account, and then withdraw $ 50.00. The other will deposit $ 203.75 and
then you will withdraw $ 100.00.

### Bank account class to use as a base.
```java
public class CuentaBancaria {
  private double balance;
  private String numeroCuenta;
  public CuentaBancaria(String numeroCuenta, double balanceInicial) {
    this.numeroCuenta = numeroCuenta;
    this.balance = balanceInicial;
  }
  public void depositar(double cantidad) {
    balance += cantidad;
  }
  public void retirar(double cantidad) {
  balance -= cantidad;
  }
}
```

### Start of the main method bank account.
```java
CuentaBancaria cuenta = new CuentaBancaria("12345-678",1000.00);
// Create your threads from here.
```

