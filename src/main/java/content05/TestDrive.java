package content05;

import java.io.*;
import java.util.Scanner;

public class TestDrive {

    private static final int BUFFER_SIZE = 0;

    // 1
    static String firstLineOfFile(String path, String defaultVal) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try
        {
            return br.readLine();
        }
        catch (IOException e)
        {
            return defaultVal;
        }
        finally
        {
            // TODO: handle exception
            br.close();
        }
    }


    // try with resource
    // 2
    static String firstLineOfFileWell(String path, String defaultVal)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            return br.readLine();
        }
        catch (IOException e)
        {
            return defaultVal;
        }
    }


    // 3
    static void copy(String src, String dst) throws IOException
    {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst))
        {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }


    public static void main(String[] args) {

        // try-catch-finally
		Scanner scanner = null;
		try
		{
		    scanner = new Scanner(new File("D:\\intellij-workspace\\ITWiki\\src\\main\\resource\\test.txt"));
		    while (scanner.hasNext())
		    {
		        System.out.println(scanner.nextLine());
		    }
		}
		catch (FileNotFoundException e)
		{
		    e.printStackTrace();
		}
		finally
		{
		    if (scanner != null)
		    {
		    	System.out.println("Hello");
		        scanner.close();
		    }
		}

        // How to do with -- try with resource????
        // try-with-resources - try(Resources)




//        // 2
//		try
//		{
//			int data = 25 / 0;
//			System.out.println(data);
//		}
//		catch (NullPointerException e) {System.out.println("Ali");}
//		finally
//		{
//			//int data = 25 / 0;
//			System.out.println("Ben hep çalışırım");
//		}



        // Try catch Finaly!
//		try
//		{
//			int data=25/5;
//			System.out.println(data);
//		}
//		catch(NullPointerException e){System.out.println(e);}
//		finally{System.out.println("Ben hep çalışırım");}



//        try
//        {
//            int data = 25 / 0;
//            System.out.println(data);
//        }
//        catch (ArithmeticException e) {System.out.println(e);}
//        finally
//        {
//            //int data = 25 / 0;
//            System.out.println("Ben hep çalışırım");
//        }



    }
}
