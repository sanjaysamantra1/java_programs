public class SwitchDemo4 {
    public static void main(String[] args) {
        String role = "admin";
        switch (role) {
            case "admin" -> System.out.println("Full access");
            case "editor" -> System.out.println("Edit access");
            case "viewer" -> System.out.println("Read-only access");
            default -> System.out.println("Unknown role");
        }
    }
}