
public class Song {
	
	String track;
	String artist;
	float duration;
	
	Song previousSong;
	Song nextSong;
	
	Song() {
	}
	
	
	Song(String track, String artist, float duration) {
		this.track = track;
		this.artist = artist;
		this.duration = duration;
	}
	
	void showSong() {
		System.out.println("-------------------------------------");
		System.out.println(track+"\t"+artist+"\t"+duration);
		System.out.println("-------------------------------------");
		System.out.println();
	}
	
	
//	@Override
//	public String toString() {
//		return "Song [track=" + track + ", artist=" + artist + ", duration=" + duration + "]";
//	}
	









}