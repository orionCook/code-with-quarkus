package com.ooo.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3AsyncClient;
import software.amazon.awssdk.services.s3.S3Client;

import javax.inject.Inject;

public class GreetingLambda implements RequestHandler<Person, String> {

    @Override
    public String handleRequest(Person input, Context context) {
        var s3 = S3Client.builder().build();
        var buckets = s3.listBuckets();
        return "Hello " + input.getName() + " from " + buckets.buckets().size() + " buckets";
    }
}
