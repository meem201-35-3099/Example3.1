
package main_package;

import se331_3rd_prblm.*;

public class Main {

    public static void main(String[] args) {
        
        
        Department dept = new Department("SWE",35);
        Semester sem = new Semester("Spring",201);
        
        
        Student student1 = new Student("Meem Khan",dept,sem,31);
        student1.show();
        Student student2 = new Student("Jannat khan",dept,sem,31);
        student2.show();
        Student student3 = new Student("Siam Khan",dept,sem,31);
        student3.show();
        
        
        
        
    }
    
}
