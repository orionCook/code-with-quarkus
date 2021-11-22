package com.ooo.lambda.SSM;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.jboss.logging.Logger;
import software.amazon.awssdk.services.ssm.SsmClient;

import javax.inject.Inject;
import java.util.Map;

public class SSMLambda extends QuarkusSSMResource implements RequestHandler<String, Map<String, String>> {
  private static final Logger LOG = Logger.getLogger(SSMLambda.class);

  @Override
  public Map<String, String> handleRequest(String input, Context context) {
    LOG.info("HEY");
    return ssm.getParametersByPath(generateGetParametersByPathRequest())
        .parameters().stream().collect(parametersToMap());
  }

}
