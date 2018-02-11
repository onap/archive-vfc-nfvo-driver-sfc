/**
 * Copyright 2018 ZTE Corporation.
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
package org.onap.sfc.resources;

import org.junit.Test;
import org.onap.sfc.entity.DelReqInfo;
import org.onap.sfc.entity.FlowClassfierReq4N;
import org.onap.sfc.entity.PortChainReq4N;
import org.onap.sfc.entity.PortPairGroupReq4N;
import org.onap.sfc.entity.portpair.PortPairReq4N;

import javax.ws.rs.ProcessingException;

public class DriverResourceTest {
    public static final String URL = "http://0.0.0.0:8080";
    private DriverResource driverResource = new DriverResource();

    @Test
    public void createPortPair() throws Exception {
        try {
            PortPairReq4N portPairReq4N = new PortPairReq4N();
            portPairReq4N.setUrl(URL);
            driverResource.createPortPair(portPairReq4N);
        } catch (ProcessingException ex) {
            String message = ex.getMessage();
            assert message.contains(" Connection refused");
        }
    }

    @Test
    public void createPortPairGroup() throws Exception {
        try {
            PortPairGroupReq4N portPairGroupReq4N = new PortPairGroupReq4N();
            portPairGroupReq4N.setUrl(URL);
            driverResource.createPortPairGroup(portPairGroupReq4N);
        } catch (ProcessingException ex) {
            String message = ex.getMessage();
            assert message.contains(" Connection refused");
        }
    }

    @Test
    public void createFlowClassfier() throws Exception {
        try {
            FlowClassfierReq4N flowClassfierReq4N = new FlowClassfierReq4N();
            flowClassfierReq4N.setUrl(URL);
            driverResource.createFlowClassfier(flowClassfierReq4N);
        } catch (ProcessingException ex) {
            String message = ex.getMessage();
            assert message.contains(" Connection refused");
        }
    }

    @Test
    public void creatPortChain() throws Exception {
        try {
            PortChainReq4N portChainReq4N = new PortChainReq4N();
            portChainReq4N.setUrl(URL);
            driverResource.creatPortChain(portChainReq4N);
        } catch (ProcessingException ex) {
            String message = ex.getMessage();
            assert message.contains(" Connection refused");
        }
    }

    @Test
    public void delPortPair() throws Exception {
        try {
            DelReqInfo delReqInfo = new DelReqInfo();
            delReqInfo.setUrl(URL);
            delReqInfo.setId("123-456-789");
            driverResource.delPortPair(delReqInfo);
        } catch (ProcessingException ex) {
            String message = ex.getMessage();
            assert message.contains(" Connection refused");
        }
    }

    @Test
    public void delPortPairGroup() throws Exception {
        try {
            DelReqInfo delReqInfo = new DelReqInfo();
            delReqInfo.setUrl(URL);
            delReqInfo.setId("123-456-789");
            driverResource.delPortPairGroup(delReqInfo);
        } catch (ProcessingException ex) {
            String message = ex.getMessage();
            assert message.contains(" Connection refused");
        }
    }

    @Test
    public void delFlowClassfier() throws Exception {
        try {
            DelReqInfo delReqInfo = new DelReqInfo();
            delReqInfo.setUrl(URL);
            delReqInfo.setId("123-456-789");
            driverResource.delFlowClassfier(delReqInfo);
        } catch (ProcessingException ex) {
            String message = ex.getMessage();
            assert message.contains(" Connection refused");
        }
    }

    @Test
    public void delPortChain() throws Exception {
        try {
            DelReqInfo delReqInfo = new DelReqInfo();
            delReqInfo.setUrl(URL);
            delReqInfo.setId("123-456-789");
            driverResource.delPortChain(delReqInfo);
        } catch (ProcessingException ex) {
            String message = ex.getMessage();
            assert message.contains(" Connection refused");
        }
    }

}