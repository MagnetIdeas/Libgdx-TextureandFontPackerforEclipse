package com.rowland.texturepacker;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;

/**
 * @author Rowland
 *
 */
public class TexturePackerHolder {

	private  String inputDir;
	private  String outputDir;
	private  String packFileName;
	private  Settings settings;
	
	public TexturePackerHolder(Settings settings, String inputDir, String outputDir, String packFileName) 
	{
		this.settings = settings;
		this.inputDir = inputDir;
		this.outputDir  =  outputDir;
		this.packFileName  =  packFileName;
	}

	public String getInputDir() {
		return inputDir;
	}


	public void setInputDir(String inputDir) {
		this.inputDir = inputDir;
	}


	public String getOutputDir() {
		return outputDir;
	}


	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}


	public String getPackFileName() {
		return packFileName;
	}


	public void setPackFileName(String packFileName) {
		this.packFileName = packFileName;
	}

	public Settings getSettings() {
		return settings;
	}


	public void setSettings(Settings settings) {
		this.settings = settings;
	}

}
