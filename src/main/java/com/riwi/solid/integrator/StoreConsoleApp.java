package com.riwi.solid.integrator;

import java.util.List;
import java.util.Scanner;

public class StoreConsoleApp {
    private static final List<Product> PRODUCTS = List.of(
            new Product(1, "Teclado mecánico", 220_000),
            new Product(2, "Mouse inalámbrico", 95_000),
            new Product(3, "Audífonos", 180_000),
            new Product(4, "Base para portátil", 75_000)
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        CheckoutService checkoutService = new CheckoutService();

        boolean running = true;
        while (running) {
            printMenu();
            String option = scanner.nextLine().trim();

            switch (option) {
                case "1" -> listProducts();
                case "2" -> addProduct(scanner, cart);
                case "3" -> showCart(cart);
                case "4" -> checkout(scanner, cart, checkoutService);
                case "0" -> running = false;
                default -> System.out.println("Opción inválida.");
            }
        }

        System.out.println("Hasta luego.");
    }

    private static void printMenu() {
        System.out.println("\n=== RIWI STORE ===");
        System.out.println("1. Ver productos");
        System.out.println("2. Agregar al carrito");
        System.out.println("3. Ver carrito");
        System.out.println("4. Finalizar compra");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    private static void listProducts() {
        System.out.println("\nProductos:");
        PRODUCTS.forEach(product ->
                System.out.printf("%d. %s - $%.0f%n", product.id(), product.name(), product.price()));
    }

    private static void addProduct(Scanner scanner, Cart cart) {
        listProducts();
        System.out.print("ID del producto: ");
        int id = readInt(scanner);
        Product product = PRODUCTS.stream()
                .filter(candidate -> candidate.id() == id)
                .findFirst()
                .orElse(null);

        if (product == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.print("Cantidad: ");
        int quantity = readInt(scanner);
        if (quantity <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        cart.add(product, quantity);
        System.out.println("Producto agregado.");
    }

    private static void showCart(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        System.out.println("\nCarrito:");
        cart.getItems().forEach(item ->
                System.out.printf("%s x%d = $%.0f%n",
                        item.product().name(), item.quantity(), item.subtotal()));
        System.out.printf("Total: $%.0f%n", cart.total());
    }

    private static void checkout(Scanner scanner, Cart cart, CheckoutService service) {
        if (cart.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        System.out.print("Tipo de cliente [REGULAR/PREMIUM/VIP]: ");
        String customerType = scanner.nextLine().trim();
        System.out.print("Pago [CASH/CARD]: ");
        String paymentType = scanner.nextLine().trim();
        System.out.print("Notificación [EMAIL/SMS/CONSOLE]: ");
        String notificationType = scanner.nextLine().trim();

        service.checkout(cart, customerType, paymentType, notificationType);
    }

    private static int readInt(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException exception) {
            return -1;
        }
    }
}
