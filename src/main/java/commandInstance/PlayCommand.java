package commandInstance;

import command.Command;

/**
 * 
* 具体命令角色类
 */
public class PlayCommand implements Command {
	
	private AudioPlayer myAudio;
	
	public PlayCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	public void execute() {
		myAudio.play();
	}

}
