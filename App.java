public class App {
    public static void main(String[] args) throws Exception {
        LibMath<Integer, Integer> LibMath = new LibMath<> (10,20);
        LibMath<Double, Double> LibMath2 = new LibMath<> (10.0, 10.0);
        LibMath<Integer, Double> LibMath3 = new LibMath<> (10, 20.0);
        LibMath<Double, Integer> LibMath4 = new LibMath<> (10.0, 10);
        LibMath.add();
        LibMath2.add();
        LibMath3.add();
        LibMath4.add();

        GenLib.printAlamat ("Jalan Cibodas", "Nagrak");
        GenLib.printAlamat ("Jalan Cibodas", 10);
    }
}
