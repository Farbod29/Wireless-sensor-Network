import java.io.*;
import java.nio.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ByteBufferClear {
	
	public static void CLearBuffer () throws IOException
	{
		FileInputStream aFile = new FileInputStream("/Users/farbodaprin/Desktop/Convertor/a.txt");
		FileInputStream bFile = new FileInputStream("/Users/farbodaprin/Desktop/Convertor/b.txt");
		FileChannel inChannel = aFile.getChannel();
		FileChannel inChannelb = bFile.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(55);
		int bytesRead = inChannel.read(buf);
		buf.flip();
		System.out.print("\nBefore clear method data in buffer\n");
		while (buf.hasRemaining()) 
		{
			System.out.print((char) buf.get());
		}
		buf.clear();
		int bytesReadb = inChannelb.read(buf);
		buf.flip();
		System.out.print("\nAfter clear method data in buffer\n");
		while (buf.hasRemaining()) {
			System.out.print((char) buf.get());
		}
		aFile.close();
	}
}