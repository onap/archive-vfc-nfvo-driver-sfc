#!/bin/bash
install_sf(){

	sed -i 's/enabled=1/enabled=0/' /etc/yum/pluginconf.d/fastestmirror.conf
	sed -i 's|#baseurl=http://mirror.centos.org/centos|baseurl=http://mirrors.ocf.berkeley.edu/centos|' /etc/yum.repos.d/*.repo
	yum update -y
	yum install -y wget unzip socat java-1.8.0-openjdk-headless
	sed -i 's|#networkaddress.cache.ttl=-1|networkaddress.cache.ttl=10|' /usr/lib/jvm/jre/lib/security/java.security

	# get binary zip from nexus
	wget -q -O vfc-sfcdriver-zte.zip 'https://nexus.onap.org/service/local/artifact/maven/redirect?r=snapshots&g=org.onap.vfc.nfvo.driver.sfc.zte.sfc-driver-standalone&a=vfc-nfvo-driver-sfc-zte-sfc-driver&v=LATEST&e=zip' && \
    	unzip vfc-sfcdriver-zte.zip && \
    	rm -rf vfc-sfcdriver-zte.zip

	chmod +x *.sh
	chmod +x docker/*.sh
}

add_user(){

	useradd onap
	chown onap:onap -R /service
}

clean_sf_cache(){
								
	yum clean all
}

install_sf
wait
add_user
clean_sf_cache
