package nl.trivento.lambda;
import com.amazonaws.services.lambda.runtime.Context;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;


public class JavaTest {
  private int called = 0;
  public void greeting(InputStream input, OutputStream output, Context context) throws IOException {
    String result = "Greetings. [" + called++ + "] " + context.getAwsRequestId();
    output.write(result.getBytes("UTF-8"));
  }



}
