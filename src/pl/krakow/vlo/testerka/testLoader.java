package pl.krakow.vlo.testerka;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 
 */

/**
 * wczytywanie testow skads
 * @author severus
 *
 *
 */
public class testLoader 
{
	private File root;

	public testLoader(File root) {
		this.root = root;
	}
	public File[] getTest()
	{
		File inDir = new File(root, "in");
		return inDir.listFiles(new FilenameFilter()
		{
			
			@Override
			public boolean accept(File dir, String name) 
			{
				return name.endsWith(".in");
			}
		});	
	}
}
