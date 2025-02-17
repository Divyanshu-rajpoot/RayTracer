import java.io.PrintStream;

public class Color {
    private vector3d pixelcolor;  //define the pixel color in a vector 


    public Color( vector3d pixelcolor){  //contructor for the color pixel
        this.pixelcolor = pixelcolor;
    }

    //how to write the color in the function?
    public void writecolor(PrintStream out){
        double r = pixelcolor.x();
        double g = pixelcolor.y();
        double b =  pixelcolor.z();

        int rbyte = (int)(255.999 * r);
        int gbyte = (int)(255.999 * g);
        int bbyte = (int)(255.999 * b);
        
        out.println(rbyte + " " + gbyte + " " + bbyte);
    }

}


