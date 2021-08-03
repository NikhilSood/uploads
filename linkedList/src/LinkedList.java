
public class LinkedList {
	
	Song head;
	Song tail;
	private int length;
	
	
	
	boolean isEmpty() {
		return head==null;
	}
	
	int length() {
		return length;
	}
	
	void add(Song song) {
		
		length++;
		
		if(head==null) {
			head=song;
			tail=song;
		}else {
			
		}
		
		tail.nextSong=song;
		song.previousSong=tail;
		head.previousSong=song;
		tail=song;
		song.nextSong=head;
	      
	}
	
	
	
void iterate(boolean forwardBackward) {
		
		if(forwardBackward) {
			Song temporarySong = head; // Reference Copy
			
			while(true) {
				temporarySong.showSong();
				temporarySong = temporarySong.nextSong;
				
				if(temporarySong == tail) {
					temporarySong.showSong();
					break;
				}
			}
		}else {
			Song temporarySong = tail; // Reference Copy
			
			while(true) {
				temporarySong.showSong();
				temporarySong = temporarySong.previousSong;
				
				if(temporarySong == head) {
					temporarySong.showSong();
					break;
				}
			}
			
		}
		
		
		
	}
	
	
	
	
}
