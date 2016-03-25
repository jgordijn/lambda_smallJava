package nl.trivento.lambda;
import com.amazonaws.services.lambda.runtime.Context;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;


public class JavaTest {
  private int called = 0;
  public void greeting(InputStream input, OutputStream output, Context context) throws IOException {

    String result = "Greetings. " + InetAddress.getLocalHost().getHostAddress() + " [" + called++ + "] " + context.getAwsRequestId() + "> " + System.getenv();
    output.write(result.getBytes("UTF-8"));
  }



}
