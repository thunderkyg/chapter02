package com.javaex.ex08;

public class Tv {

	
//	필드
	private int channel;
	private int volume;
	private boolean power;
	
	
//	생성자
	public Tv() {
		
	}
	
	public Tv(int channel, int volume, boolean power) {
		if(channel<1) {
			this.channel = 0;
		} else if (channel>255) {
			this.channel = 255;
		} else { this.channel = channel;}
		
		if(volume<0) {
			this.volume = 0;
		} else if (volume>100) {
			this.channel = 100;
		} else { this.volume = volume;}
		
		this.power = power;
	}

	
// 메소드 - Getter

	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}
	
//	메소드 - Normal
	
	// Power Method
	public void power (boolean on) {
		if(on == true) {
			this.power = on;
		} else {this.power = false;}
	}
	
	
	// Channel Method
	public void channel(int channel) {
		if(channel<1) {
			this.channel = 1;
		} else if (channel>255) {
			this.channel = 255;
		} else { this.channel = channel;}
	}
	
	public void channel (boolean up) {
		if (up == true) {
			this.channel = channel + 1;
			if (channel>100) {this.channel = 100;}
		} else {
			this.channel = channel - 1;
			if (channel<1) {this.channel = 1;}
		}
	}
	
	// Volume Method
	public void volume (int volume) {
		if(volume<0) {
			this.volume = 0;
		} else if (volume>100) {
			this.volume = 100;
		} else { this.volume = volume;}
	}
	
	public void volume (boolean up) {
		if (up == true) {
			this.volume = volume + 1;
			if (volume>255) {this.volume = 255;}
		} else {
			this.volume = volume - 1;
			if (volume<0) {this.volume = 0;}
		}
	}
	
	
	
	public void status() {
		System.out.println(channel + ", " + volume + ", " + power);
		System.out.println();
	}
}