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
        return new vector3d(e[0] + v.e[0], e[0]+ v.e[1], e[0]+v.e[2]);   //return a new vector added
    }

    public vector3d multiple (double t){     //multiply the vector with a t co-ordinate
        return new vector3d(e[0] * t, t * e[1], t*e[2]);
    }

    public vector3d divide(double scalar){   //divide the vector with a scalar quantity
        return multiple(1/scalar);
    }

    public double length(){
        return Math.sqrt(square_length());
    }

    public double square_length(){           //squared the length of vector co-ordinate
        return e[0]*e[0] + e[1]*e[1] + e[2]*e[2];
    }

    //starting of the utility functions


    //display the vector in strings
    public static String vectoString(vector3d vec){
        return vec.x() + " " + vec.y() + " " + vec.z();
    }

    public static vector3d add(vector3d vec1 , vector3d vec2){ //addition forntion for two vectors
        return new vector3d(vec1.e[0] + vec2.e[0],vec1.e[1] + vec2.e[1] , vec1.e[2] + vec2.e[2] );
    }

    public static vector3d subtract(vector3d vec1 , vector3d vec2){
        return new vector3d(vec1.e[0] - vec2.e[0], vec1.e[1] - vec2.e[1], vec1.e[2] - vec2.e[2]);
    }

    public static vector3d multiply(vector3d vec1 , vector3d vec2){
        return new vector3d(vec1.e[0] * vec2.e[0], vec1.e[1] * vec2.e[1], vec1.e[2] * vec2.e[2]);
    }







    //using point 3 vector   //use the poitn3 as a vector now
    class Point3 extends vector3d{
        public Point3(){
            super();
        }
        public Point3(double e0 , double e1 , double e2){
            super(e0, e1 , e2);
        }
    }





    

    public static void main(String[] args) {
        
    }

}
