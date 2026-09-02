package com.riwi.solid.exercises.isp.ex04;

public interface CloudStorage {
    String read(String key);
    void write(String key, String value);
    void delete(String key);
}
