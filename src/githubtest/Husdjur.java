/*
 *  
Java18-OOJ
 */
package githubtest;

/**
 *
 * @author xingao
 */
public class Husdjur {
    private String namn;
    private int vikt;
        
    public Husdjur(){     
    }
    
    public Husdjur(String namn,int vikt){
        setNamn(namn);
        this.vikt=vikt;   
    }
    
    public String getNamn(){
        return namn;
    }
    
    public int getVike(){
        return vikt;
    }
    
   
      
    public void setNamn(String namn){
        this.namn=namn;
    }
}
