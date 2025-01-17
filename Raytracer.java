import java.io.FileWriter;

public class Raytracer {

    static int Image_width = 256;
    static int Image_height = 256;
    public static void main(String[] args) {


        try {
            FileWriter writer = new FileWriter("render.ppm");

            //writing the general format of ppm image
            writer.write("P3\n");
            writer.write(Image_height + " " + Image_width + "\n");
            writer.write("255\n");

            //creating a pattern
            for (int i = 0; i < Image_height; i++) {
                System.out.print("\rLines Remaining " + (Image_height-i));
                // System.out.flush();
                for (int j = 0; j < Image_width; j++) {
                    double r = (double) j / (Image_width - 1) ;
                    double g = (double) i / (Image_height - 1) ; 
                    double b = 0.0;

                    int ir = (int) (255.999 * r);
                    int ig = (int) (255.999 * g);
                    int ib = (int) (255.999 * b);

                    writer.write(ir + " " + ig + " " + ib + "\n");
                }
                
            }
            System.out.print("\rDone               \n");
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
}