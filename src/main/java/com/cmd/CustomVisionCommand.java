package com.cmd;

import picocli.CommandLine.Command;

@Command(
		  subcommands = {
				  ClassificationCommand.class,
				  ObjectDetectionCommand.class
		  }
		)
public class CustomVisionCommand {

}
