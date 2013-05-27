package blackboard;

import de.umass.lastfm.Caller;
import de.umass.lastfm.User;

public abstract class KnowledgeSource {
	User user;
	private String artist;
	private String track;
	
	public KnowledgeSource(String artist, String track) {
		this.artist = artist;
		this.track = track;
	}
	
	public String getArtist() {
		return artist;
	}

	public String getTrack() {
		return track;
	}
	
}
