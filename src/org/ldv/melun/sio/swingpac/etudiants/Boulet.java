package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;

import org.ldv.melun.sio.swingpac.Bidule;

public class Boulet extends Bidule {

  
  public Boulet() {
    super("bozier");
    setBackground(Color.PINK);    
  }

   @Override
  public void doMove() { 
	   setIncX(0);
	   setIncY(0);
    super.doMove();    
  }

  @Override
  protected void doAfterImpactByOther() {
    super.doAfterImpactByOther();
  }

  
}
