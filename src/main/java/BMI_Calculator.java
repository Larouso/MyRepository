public class BMI_Calculator {
    
    public static void main(String []args){
        
        double weight = 81.2;
        double height = 1.76;
        double height_2 = height * height;
        double bmi = (weight * height_2) / 10;
        System.out.println("Your BMI is: " + bmi);
        
    
    }
    
}
