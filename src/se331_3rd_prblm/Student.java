
package se331_3rd_prblm;

public class Student extends Person {
    
    private String ID;
    private int batch;
    private Semester admissionSemester = new Semester();
    private final int lastSerial = 3000;
    private static int count;
    
    public Student(){
        
    }
    public Student(String name,Department dept,Semester sem,int batch){
        this.name = name;
        this.dept = dept;
        this.batch = batch;
        this.admissionSemester = sem;
        
        count ++;
        this.ID = generateID();
    }
    
    public String generateID(){
        int serial = lastSerial+count;
        return admissionSemester.getCode()+"-"+dept.getCode()+"-"+serial;
    }
    public void show(){
        System.out.println("Student's info:\nID:"+ID+"\nName: "+name+"\nDept: "+dept.getName()+"\nBatch: "+batch+"\n"); 
    }

   
}
