package com.dp.structural.a.adaptor;
//adaptoing roundpeg to square pag
public class PegAdaptor extends SquarePeg {
	private RoundPeg roundPeg;

	public PegAdaptor(RoundPeg roundPeg) {
		this.roundPeg = roundPeg;
	}

	@Override
	public void insert(String str) {
		roundPeg.insertTohole(str);
	}

}