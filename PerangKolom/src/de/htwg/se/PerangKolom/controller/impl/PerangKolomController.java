package de.htwg.se.PerangKolom.controller.impl;

import de.htwg.se.PerangKolom.controller.IPerangKolomController;
import de.htwg.se.PerangKolom.util.observer.Observable;

public class PerangKolomController extends Observable implements IPerangKolomController{

	
	@Override
	public void copy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCellsPerRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCellsPerColumns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getGridString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getValue(int row, int column) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void highlight(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCandidate(int row, int column, int candidate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGiven(int row, int column) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHighlighted(int row, int column) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSet(int row, int column) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(int row, int col, int val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllCandidates() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showCandidates(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int blockAt(int row, int column) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void parseStringToGrid(String gridString) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetSize(int newSize) {
		// TODO Auto-generated method stub
		
	}

}
