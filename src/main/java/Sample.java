public class Sample {
    String name;

    public Sample(String name) {
	this.name = name;
    }

    public String greeting() {
	return "Hello, " + name;
    }

    public static void main(String[] args) {
	Sample sample = new Sample("World");
	System.out.println(sample.greeting());
    }
}
