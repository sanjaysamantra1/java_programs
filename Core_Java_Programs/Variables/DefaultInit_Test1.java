class ExamDefaultInit_Test1ple {
    int age; // Field: automatically defaults to 0

    void test() {
        int count;

        // System.out.println(count);
        // Compilation error: local variable not initialized
        count = 10;
        System.out.println(count);
    }
}