FROM ubuntu:14.04

ARG HTTP_PROXY=${HTTP_PROXY}
ARG HTTPS_PROXY=${HTTPS_PROXY}

ENV http_proxy $HTTP_PROXY
ENV https_proxy $HTTPS_PROXY

RUN apt-get update && apt-get install -y software-properties-common
RUN apt-get install -y wget && \
    apt-get install -y unzip && \
    apt-get install -y curl && \
    apt-get install -y build-essential && \
    apt-get install -y libssl-dev
RUN sudo -E add-apt-repository ppa:openjdk-r/ppa && apt-get update && apt-get install -y openjdk-8-jdk && apt-get install -y git curl && apt-get install -y pandoc

ADD . /service
WORKDIR /service

# get binary zip from nexus
RUN wget -q -O vfc-sfcdriver-zte.zip 'https://nexus.onap.org/service/local/artifact/maven/redirect?r=snapshots&g=org.onap.vfc.nfvo.driver.sfc.zte.sfc-driver-standalone&a=vfc-nfvo-driver-sfc-zte-sfc-driver&v=LATEST&e=zip' && \
    unzip vfc-sfcdriver-zte.zip && \
    rm -rf vfc-sfcdriver-zte.zip

EXPOSE 8411

WORKDIR /service
RUN chmod +x docker/*.sh
ENTRYPOINT docker/docker-entrypoint.sh
