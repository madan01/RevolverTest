FROM ubuntu:14.04
MAINTAINER madan.venugopal@gmail.com

# Install Java.
RUN echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | debconf-set-selections
RUN echo "deb http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main" > /etc/apt/sources.list.d/webupd8team-java-trusty.list
RUN apt-key adv --keyserver keyserver.ubuntu.com --recv-keys EEA14886
RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y --force-yes --no-install-recommends oracle-java8-installer && apt-get clean all

## JAVA_HOME
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

EXPOSE 8080

VOLUME /var/log/revolver_test

ADD RevolverConfig.yml RevolverConfig.yml
ADD target/RevolverTest-1.0.0-jar-with-dependencies.jar RevolverTest.jar

CMD sh -c "java -jar RevolverTest.jar server RevolverConfig.yml"
