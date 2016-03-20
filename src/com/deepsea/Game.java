package com.deepsea;

public class Game {

	//windows globals
	static int xwidth = 800, xheight = 600;
	static int framerate = 60;
	static boolean fullscreen = false;
	static boolean debug = false;
	static float mouseSensitivity = 0.05f;
	static float xfov = 75.0f;
	
	//fps caluclations
	double time, lastTime;
	static float dt, dT;
	
	//classes

	//strings
	static String title = "deepsea engine";
	static String version = "0.0.4";
	
	
}
