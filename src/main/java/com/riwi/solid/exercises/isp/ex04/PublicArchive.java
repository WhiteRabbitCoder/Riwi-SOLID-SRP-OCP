package com.riwi.solid.exercises.isp.ex04;

public class PublicArchive implements CloudStorage {
    @Override public String read(String key) { return "contenido"; }
    @Override public void write(String key, String value) { throw new UnsupportedOperationException(); }
    @Override public void delete(String key) { throw new UnsupportedOperationException(); }
}
