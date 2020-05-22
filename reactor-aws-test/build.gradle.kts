plugins {
    id("io.freefair.lombok") version "5.0.1"
}

dependencies {

    compile("io.projectreactor:reactor-test:3.3.5.RELEASE")
    compile("org.testcontainers:testcontainers:1.14.1")
    compile( "org.testcontainers:localstack:1.14.1")
    compile("software.amazon.awssdk:cloudwatch:2.13.8")
    compile("org.mockito:mockito-junit-jupiter:3.0.0")
    compile("software.amazon.awssdk:netty-nio-client:2.13.8")
    compile("software.amazon.awssdk:http-client-spi:2.13.8")
    testCompile("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    compileOnly("io.projectreactor:reactor-core:3.3.5.RELEASE")
    compileOnly("io.projectreactor.addons:reactor-extra:3.3.3.RELEASE")
    compileOnly("org.junit.jupiter:junit-jupiter-api:5.5.2")

    compileOnly("software.amazon.awssdk:dynamodb:2.13.8")
    compileOnly("software.amazon.awssdk:sqs:2.13.8")
    compileOnly("software.amazon.awssdk:s3:2.13.8")
    compileOnly("software.amazon.awssdk:lambda:2.13.8")
    compileOnly("software.amazon.awssdk:cloudwatchlogs:2.13.8")
    compileOnly("software.amazon.awssdk:apache-client:2.13.8")
    compileOnly("software.amazon.awssdk:kinesis:2.13.8")
}
