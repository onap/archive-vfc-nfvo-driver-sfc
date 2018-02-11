/**
 * Copyright 2017 ZTE Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onap.sfc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.onap.sfc.entity.portpair.PortPairReq4N;
import org.onap.sfc.resources.DriverResource;
import org.onap.sfc.service.ISdnControllerService;
import org.onap.sfc.wrapper.N2sReqWrapper;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.ws.rs.core.*;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ISdnControllerService.class)
@PowerMockIgnore({"javax.net.ssl.*"})
public class TestPortPair {

    DriverResource resource = new DriverResource();
    @Test
    public void test_createportpair() throws Exception {
        PortPairReq4N portpair =new PortPairReq4N();
        portpair.setUrl("http://127.0.0.1:8181");
        N2sReqWrapper.convertPortPair(portpair);
    }

    @Before
    public void setupBeforeTest() throws Exception {
//        SdnServiceConsumer consumer = PowerMockito.mock(SdnServiceConsumer.class);
//        PowerMockito.when(consumer.getMsbRegisterService("http://127.0.0.1:80")).thenReturn(new MsbService() {
//            @Override
//            public MsbRegisterEntity registerServce(@QueryParam("createOrUpdate") String createOrUpdate, MsbRegisterEntity entity) throws Exception {
//                return null;
//            }
//        }) ;

        PowerMockito.mockStatic(ISdnControllerService.class);
        ISdnControllerService service = PowerMockito.mock(ISdnControllerService.class);
//        PowerMockito.doNothing().when(service).createPortPair(Mockito.anyString(),Mockito.anyString());
        PowerMockito.when(service.createPortPair(Mockito.anyString(),Mockito.anyString())).thenReturn(new Response() {
            @Override
            public int getStatus() {
                return 0;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public StatusType getStatusInfo() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Object getEntity() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public <T> T readEntity(Class<T> tClass) {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public <T> T readEntity(GenericType<T> tGenericType) {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public <T> T readEntity(Class<T> tClass, Annotation[] annotations) {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public <T> T readEntity(GenericType<T> tGenericType, Annotation[] annotations) {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public boolean hasEntity() {
                return false;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public boolean bufferEntity() {
                return false;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public void close() {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public MediaType getMediaType() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Locale getLanguage() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public int getLength() {
                return 0;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Set<String> getAllowedMethods() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Map<String, NewCookie> getCookies() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public EntityTag getEntityTag() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Date getDate() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Date getLastModified() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public URI getLocation() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Set<Link> getLinks() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public boolean hasLink(String s) {
                return false;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Link getLink(String s) {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public Link.Builder getLinkBuilder(String s) {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public MultivaluedMap<String, Object> getMetadata() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public MultivaluedMap<String, String> getStringHeaders() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public String getHeaderString(String s) {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }
        }) ;
    }

}
