package com.rowland.texturepacker;

import java.io.IOException;

import com.badlogic.gdx.tools.imagepacker.TexturePacker2;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;


/**
 * @author Rowland
 *
 */
public class MyTexturePacker  {

	public static final String INPUT_DIR ="assets/images/input/yoyo/base/";
	public static final String OUTPUT_DIR ="assets/images/output/yoyo/base/";
	public static final String PACK_FILE_NAME ="base_atlas.pack";

	public static void main(String[] args) throws IOException
	{   //Sample settings
		Settings settings = new Settings();
		settings.maxWidth = 1024;
		settings.maxHeight = 1024;
		settings.stripWhitespaceX = true;
		settings.stripWhitespaceY = true;
		settings.flattenPaths = true;
		settings.paddingX = 0 ;
		settings.paddingY = 0;
		settings.combineSubdirectories = true;

		TexturePackerHolder packerHolder = new TexturePackerHolder(settings, INPUT_DIR, OUTPUT_DIR, PACK_FILE_NAME);

		TexturePacker2.process(packerHolder.getSettings(),  packerHolder.getInputDir(), packerHolder.getOutputDir(),  packerHolder.getPackFileName());
		System.out.print("DONE : Check Output Folder for Atlas");
	}

	public void process()
	{

	}

}
