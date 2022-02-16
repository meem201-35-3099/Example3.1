
package se331_3rd_prblm;

public abstract class Person {
    
    protected String name;
    protected Department dept = new Department();
    
    public Person(){
        
    }   
    public Person(String name,Department dept){
        this.name = name;
        this.dept = dept;
    }
    public void show(){
        System.out.println(", Name:"+name+", Department: "+dept.getName());
    }
}
