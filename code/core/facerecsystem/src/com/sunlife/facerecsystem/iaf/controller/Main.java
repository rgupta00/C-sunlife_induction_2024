package com.sunlife.facerecsystem.iaf.controller;

import com.sunlife.facerecsystem.iaf.ui.*;


public class Main {

	public static void main(String[] args) {
		Face faceUi=new Face();
		faceUi.printFacePixelOnUI();
		
		com.sunlife.facerecsystem.iaf.db.Face faceDb=new com.sunlife.facerecsystem.iaf.db.Face();
		faceDb.saveFacePixelToDb();
	}
}

