package com.riwi.solid.integrator;

public interface PaymentProcessor {
    void pay(double amount);
    void refund(double amount);
    void scheduleRecurringPayment(double amount);
}
