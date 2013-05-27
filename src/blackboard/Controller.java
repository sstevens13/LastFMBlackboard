package blackboard;

import de.umass.lastfm.Caller;
import de.umass.lastfm.User;

public class Controller {
	public final static String API_KEY = "5f376ba66130fc50ab78ff155b7430a7";
	public final static String USERAGENT = "ooarch";
//	User user;

	public static void main(String[] args) {
		Caller.getInstance().setUserAgent(USERAGENT);
		//TODO set for debugging
	    Caller.getInstance().setDebugMode(true);
	    //TODO may need
	    //Caller.getInstance().setProxy(myProxy); 

		
		KS_SimilarTrack similarTrack = new KS_SimilarTrack("blur", "charmless man");
		similarTrack.getXML();
	}
}
