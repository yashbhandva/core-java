package coreJava;

public class RuntimeMethod {
    public static void main(String[] args) {
        Runtime e = Runtime.getRuntime();
        long b = e.totalMemory();
        long c = e.freeMemory();
        System.out.println(b+" : "+c);
    }
}
