package de.htwg.se.PerangKolom.controller.impl;

import de.htwg.se.PerangKolom.controller.IPerangKolomController;
import de.htwg.se.PerangKolom.model.AbstractCellArray;
import de.htwg.se.PerangKolom.model.impl.Border;
import de.htwg.se.PerangKolom.model.impl.CellArray;
import de.htwg.se.PerangKolom.util.observer.Observable;

public class PerangKolomController extends Observable implements IPerangKolomController{


	@Override
	public void createNewGrid(int x, int y) {
		 new CellArray(x,y);
		 //notifyObservers();
	}

	@Override
	public void reset() {
		if (AbstractCellArray.gameFieldAlreadyCreated != true) { 
			throw new IllegalAccessError();
		}
		//createNewGrid();
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillBorder(Border border) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void computerLogic() {
		// TODO Auto-generated method stub
		
	}



}
