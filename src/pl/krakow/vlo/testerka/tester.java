package pl.krakow.vlo.testerka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

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
	private File results;
	private compiler compiler;
	private testLoader loader;
	private resultSaver saver;
	
	public tester(File root)
	{
		super();
		this.root = root;
		this.results = new File(root, "results");
		this.testFile = new File(root, "tests");
		this.compiler = compiler
	}
	private Process getProcess() throws IOException
	{
		ProcessBuilder builder = new ProcessBuilder(binary.getAbsolutePath());
		return builder.start();
	}
	private void writeTest(Process task, File testcase) throws IOException
	{
		InputStream in = new FileInputStream(testcase);
		OutputStream out = task.getOutputStream();
		rewrite(in, out);
	}
	public void testFile(File testCase)
	{
		Process task = getProcess();
		writeTest(task, testCase);
		saveResults(task);
	}
	private void saveResult(Process task)
	{
		InputStream input = task.getInputStream()
		File outputFile = new File(results, testCase.getName());
		try(OutputStream output = new FileOutputStream(outputFile));
				InputStream input = task.getInputStream())
		{
			rewrite(in, out);
		}
		catch(FileNotFoundException e)
		{
			Logger.getAnonymousLogger().log(Level.SEVERE, "Nie mamy wyjœcia...", e);
		}
		
		
	}
	private void rewrite(InputStream in, OutputStream out)
	{
		int buff = 0;
		try
		{
			while((buff = in.read()) != -1)
				out.write(buff);
		}
		catch(IOException e)
		{
			Logger.getAnonymousLogger().log(Level.SEVERE, "Nie mamy wyjœcia...", e)''
		}
	}
	public static void main(String[] args)
	{
		tester Tester = new tester(new File())
	}
}
