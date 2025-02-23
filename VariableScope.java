public class VariableScope {
    // Declare the global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print globalCount in main
        System.out.println("Global Count (from main): " + globalCount);

        // Call showScope method
        showScope();
    }

    public static void showScope() {
        // Declare a local variable
        int localCount = 50;

        // Print globalCount and localCount
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
