package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;

import org.ldv.melun.sio.swingpac.Bidule;

public class Toto extends Bidule {

  public Toto(String name) {
    super(name);
  }

  public Toto() {
    super("zoé");
    setBackground(Color.yellow);
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
    if (isGoDown())
      goOnTop();

  }

  
  
}
