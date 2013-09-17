package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;
import java.util.Random;

import org.ldv.melun.sio.swingpac.Bidule;

public class Gregy extends Bidule {

  
  public Gregy() {
    super("gregy");
    setBackground(Color.GREEN);    
  }
  

  
  @Override
  public void doMove() {  
       
  
  protected static Random alea;
  
  static 
	    alea = new Random();
	  
	   
   if (alea > 3){
		   goOnLeft();
		}
		   else if (alea > 2){
			   goOnRight();
			}
			   else if (alea > 1){
				   goOnDown();
				}    
			   else {
				   goOnTop();
			   }
  
super.doMove(); 
  }
  

  @Override
  protected void doAfterImpactByOther() {
    super.doAfterImpactByOther();
  }
 
  }
}
