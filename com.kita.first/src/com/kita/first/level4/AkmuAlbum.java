package com.kita.first.level4;

public interface AkmuAlbum {
	//상수필드
	/* public static final : 없어도됨 */ String SONG_WRITER = "이찬혁";
	int PRICE = 20_000;
	
	//추상메소드
	public abstract void playAkmuAlbum();
	void stopAkmuAlbum();
}
