import java.util.*;
public class vector3d {

    private double[] e;  //initializeing the e a vector value

    public vector3d(){   //contructing a vextor / or initilaizing the vector
        e = new double[]{0,0,0};   //initialze the vector positions
    }

    public vector3d(double e0 , double e1 , double e2){  
        //creating a new vector coordinates
        e = new double[]{e0, e1 , e2};
    }

    //getting each and every vector co-ordinates
    public  double x(){    //get the x co-ordinate
        return e[0];
    }
    public double y(){    // get the y co-ordinate 
        return e[1];
    }
    public double z(){    // get the z co-ordinate
        return e[2];
    }

    public vector3d negate(){              //helps in negating the vector values
        return new vector3d(-e[0], -e[1], -e[2]);
    }

    public double get(int i){             // get the value of a vector co- ordiantes
        return e[i];
    }
 
     public double set(int i , double value){  //set the value of the vector 
        return e[i] = value;
    }

    public vector3d add (vector3d v){         // addition of vector 3d classes
        
    }


    public static void main(String[] args) {
        
    }

}
