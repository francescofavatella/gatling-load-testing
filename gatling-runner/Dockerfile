FROM openjdk:8-jdk-alpine
WORKDIR /opt/app/java

ARG GATLING_VERSION=3.5.0

# Download and extract gatling bundle
RUN wget https://repo1.maven.org/maven2/io/gatling/highcharts/gatling-charts-highcharts-bundle/${GATLING_VERSION}/gatling-charts-highcharts-bundle-${GATLING_VERSION}-bundle.zip \
&& unzip gatling-charts-highcharts-bundle-${GATLING_VERSION}-bundle.zip -d /tmp \
&& mv /tmp/gatling-charts-highcharts-bundle-${GATLING_VERSION} ./gatling \
&& rm gatling-charts-highcharts-bundle-${GATLING_VERSION}-bundle.zip

ENV GATLING_HOME /opt/app/java/gatling
ENV PATH="$PATH:/opt/app/java/gatling/bin"

ENTRYPOINT ["gatling.sh"]