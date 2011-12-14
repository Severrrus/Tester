package pl.krakow.vlo.testerka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 */

/**
 * calosc testujaca projekt, zadanie
 * @author severus
 *
 * TODO napisac caly projekt do testowania lol
 */
public class tester 
{
	private File root;
	private File binary;
	private compiler compiler;
	private testLoader loader;
	private resultSaver saver;
	
	public tester(File root)
	{
		super();
		this.root = root;
	}
	private Process getProcess() throws IOException
	{
		ProcessBuilder builder = new ProcessBuilder(binary.getAbsolutePath());
		return builder.start();
	}
	private void writeTest(Process task, File testcase)
	{
		InputStream in = new FileInputStream(testcase);
		OutputStream out = task.getOutputStream();
		int buff = 0;
		while((buff = in.read())!= -1 )
			out.write(buff);
	}
	public void testFile(File testCase)
	{
		Process task = getProcess();
		task.
	}
}
