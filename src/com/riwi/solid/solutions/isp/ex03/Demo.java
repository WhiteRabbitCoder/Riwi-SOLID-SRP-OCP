package com.riwi.solid.solutions.isp.ex03;

/**
 * SOLUCIÓN ISP 03 — Gestión de usuarios
 *
 * UserOperations mezclaba lectura y escritura. Se divide según lo que cada
 * consumidor necesita: consultar, crear/editar o eliminar.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== ISP 03 — Gestión de usuarios ==");
        UserViewer viewer = new UserViewer();
        UserAdmin admin = new UserAdmin();

        // El panel de consulta depende solo de lectura.
        showProfile(viewer);
        showProfile(admin);

        // La administración pide capacidades adicionales.
        admin.createUser();
        admin.updateUser();
        admin.deleteUser();
    }

    static void showProfile(UserReader reader) {
        reader.findUser();
    }

    public static void main(String[] args) {
        run();
    }
}

interface UserReader {
    void findUser();
}

interface UserWriter {
    void createUser();
    void updateUser();
}

interface UserRemover {
    void deleteUser();
}

class UserViewer implements UserReader {
    @Override public void findUser() { System.out.println("Consultando usuario"); }
}

class UserAdmin implements UserReader, UserWriter, UserRemover {
    @Override public void findUser() { System.out.println("Consultando usuario (admin)"); }
    @Override public void createUser() { System.out.println("Creando usuario"); }
    @Override public void updateUser() { System.out.println("Actualizando usuario"); }
    @Override public void deleteUser() { System.out.println("Eliminando usuario"); }
}
