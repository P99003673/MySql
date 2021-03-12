package com.ltts.demoweb2.model;

public class Auction {

	private int auctionId;
	private String playerName;
	private int price;
	
	public Auction(int auctionId, String playerName, int price) {
		super();
		this.auctionId = auctionId;
		this.playerName = playerName;
		this.price = price;
	}
	
	

	public Auction() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
