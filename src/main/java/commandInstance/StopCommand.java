package commandInstance;

import command.Command;

public class StopCommand implements Command {

	private AudioPlayer myAudio;

	public StopCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}
	
	public void execute() {
		myAudio.stop();
	}

}
