package blackboard;

import java.util.Collection;

import de.umass.lastfm.Track;
import de.umass.lastfm.User;

public class KS_SimilarTrack extends KnowledgeSource {
//	User user;

	
	
	public KS_SimilarTrack(String artist, String track) {
		super(artist, track);
	}

	public void getTracks() {
		
		Collection<Track> tracks = Track.getSimilar(getArtist(), getTrack(), Controller.API_KEY);
		System.out.println("The Similar Tracks");
		for (Track track : tracks) {
			System.out.println(track.getName());
		}
	}
	
	
}
