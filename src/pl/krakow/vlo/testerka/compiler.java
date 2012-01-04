package pl.krakow.vlo.testerka;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * 
 */

/**
 *  Kompiluje plik
 * @author severus
 *
 */
public class compiler
{
	private static final Logger log = Logger.getLogger(compiler.class.getName());
	public File compile(File what)
	{
		File output = new File(what.getParentFile(), "out");
		File[] toCompile = root.listFles(new FilenameFilter()
		{
			public boolean accept(File dir, String name)
			{
				return name.endsWith(".cpp");
			}
		});
		if(toCompile.length > 1)
			throw new IllegalStateException(
					"Dwa lub wiecej plikow");
		try
		{
			Runtime.getRuntime().exec(getCompilerCommand() + " "
					+ getCompilerFlags() + " "
					+ what.getAbsolutePath() + " " 
						+ getOutputSwitch() + output.getAbsolutePath());
		}
		catch(IOException e)
		{
			log.log(Level.SEVERE, "Wyj¹tek", e);
		}
		return null;
	}
	protected String getCompilerCommand()
	{
		return "gcc";
	}
	protected String getOutputSwitch()
	{
		return "-o";
	}
	protected String getCompilerFlags()
	{
		return "-O2 -static -lm";
	}
}

