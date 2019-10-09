package entity;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class voice {
	public static void speak(String message) {
		String voiceName = "kevin16";
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice helloVoice;
        helloVoice = voiceManager.getVoice(voiceName);
        if (helloVoice == null) {
            System.err.println("Cannot find a voice named " + voiceName + 
            				".  Please specify a different voice.");
            System.exit(1);
        }
        
        /* 
         * Allocates the resources for the voice.
         */
        helloVoice.allocate();
        
        /* 
         * Synthesize speech.
         */
        helloVoice.speak(message);

        /* 
         * Clean up and leave.
         */
        helloVoice.deallocate();
        //System.exit(0);
	}
}
