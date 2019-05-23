FROM docker:dind

USER root

RUN \
  apk update && \
  apk upgrade && \
  apk add openjdk8 && \
  apk add git && \
  apk add curl tar bash && \
  rm -rf /var/cache/apk/*


ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk


ARG MAVEN_VERSION=3.5.4
ARG USER_HOME_DIR="/root"
ARG BASE_URL=https://apache.osuosl.org/maven/maven-3/${MAVEN_VERSION}/binaries

RUN mkdir -p /usr/share/maven /usr/share/maven/ref \
  && curl -fsSL -o /tmp/apache-maven.tar.gz ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
  && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
  && rm -f /tmp/apache-maven.tar.gz \
  && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn \
  && mkdir -p /root/.m2 /root/.m2/repository

ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"