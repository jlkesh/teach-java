package uz.jl.teach;

/**
 * this class just for testing
 * @author jlkesh
 */
public class Main {

    public Main() {
    }

    /**
     * this is entry point method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * This method multiplies given double parameter by 2
     *
     * @param a is input parameter
     * @return returns doubled value of <code>a</code> input param
     * @see uz.jl.teach.Main#multiplyByTwo(int)
     */
    public double multiplyByTwo(double a) {
        return 2 * a;
    }


    /**
     * {@index entry}
     * This method multiplies given int parameter by 2
     * {@link  uz.jl.teach.Main#multiplyByTwo(double) }
     *
     * @param a is input parameter
     * @return returns doubled value of <code>a</code> input param
     */
    public int multiplyByTwo(int a) {
        return 2 * a;
    }

}