## Set Up SSM locally
1. Start localstack container for SSM
`docker run --rm --name local-ssm --publish 8014:4583 -e SERVICES=ssm -e START_WEB=0 -d localstack/localstack:0.11.1`
2. Configure an aws profile for local instance using AWS CLI
`$ aws configure --profile localstack
AWS Access Key ID [None]: test-key
   AWS Secret Access Key [None]: test-secret
   Default region name [None]: us-east-1
   Default output format [None]:
`
