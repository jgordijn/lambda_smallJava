package nl.trivento.lambda;
import com.amazonaws.services.lambda.runtime.Context;

public class JavaTest {
  private String id = java.util.UUID.randomUUID().toString();
  private static String jvmId = java.util.UUID.randomUUID().toString();

  public void greeting(java.io.InputStream input, java.io.OutputStream output, Context context) throws java.io.IOException {
    Long runtime = (System.nanoTime() - Long.parseLong(System.getenv().get("LAMBDA_RUNTIME_LOAD_TIME")))/1000000;
    String result = String.format("Greetings from %s Current time: %sns, Running since: %sns, Running for:%sms, classID: %s, jvmId: %s, requestId: %s", java.net.InetAddress.getLocalHost().getHostAddress(), System.nanoTime(), System.getenv().get("LAMBDA_RUNTIME_LOAD_TIME"), runtime, id, jvmId, context.getAwsRequestId());
    output.write(result.getBytes("UTF-8"));
  }
}
