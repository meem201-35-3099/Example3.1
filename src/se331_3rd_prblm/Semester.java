
package se331_3rd_prblm;

public class Semester {
    
    private String name;
    private int code;
    
    public Semester(String name,int code){
        this.name = name;
        this.code = code;
    }
    
    public Semester(){
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getCode(){
        return code;
    }
}
