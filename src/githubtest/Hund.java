/*
 *  
Java18-OOJ
 */
package githubtest;

/**
 *
 * @author xingao
 */
public class Hund extends Husdjur implements IFoder{
    
    public Hund(){
        
    }
    public Hund(String namn, int vikt) {
        super(namn, vikt);
    }
    
    //Override metoden som sätter viss fod som behövs
    public String foderNamn(){
        return "DogsFood";
    }
    //Override metoden som räknar vikt av viss fod som behövs
    public int foderGram() {
      return super.getVike()/100;
    }   
}
