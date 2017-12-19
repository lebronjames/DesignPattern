package commandInstance;

import command.Command;

public class RewindCommand implements Command {

	private AudioPlayer myAudio;

	public RewindCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	public void execute() {
		myAudio.rewind();
	}

}
