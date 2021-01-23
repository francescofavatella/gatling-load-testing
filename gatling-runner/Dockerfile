FROM openjdk:8-jdk-alpine
WORKDIR /opt/app/java

RUN wget https://repo1.maven.org/maven2/io/gatling/highcharts/gatling-charts-highcharts-bundle/3.5.0/gatling-charts-highcharts-bundle-3.5.0-bundle.zip
RUN unzip gatling-charts-highcharts-bundle-3.5.0-bundle.zip -d /tmp
RUN mv /tmp/gatling-charts-highcharts-bundle-3.5.0 ./gatling
RUN rm gatling-charts-highcharts-bundle-3.5.0-bundle.zip

ENV GATLING_HOME /opt/app/java/gatling
ENV PATH="$PATH:/opt/app/java/gatling/bin"

ENTRYPOINT ["gatling.sh"]