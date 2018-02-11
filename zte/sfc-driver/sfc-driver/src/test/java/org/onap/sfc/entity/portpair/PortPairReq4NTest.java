/**
 * Copyright 2018 ZTE Corporation.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onap.sfc.entity.portpair;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;


public class PortPairReq4NTest {
    public static final String SDN_CONTROLLER_ID = "123-456-789";
    PortPairReq4N portPairReq4N;

    @Before
    public void setUp() throws Exception {
        portPairReq4N = new PortPairReq4N();
    }

    @Test
    public void getAndSetSdnControllerId() throws Exception {
        portPairReq4N.setSdnControllerId(SDN_CONTROLLER_ID);
        assert portPairReq4N.getSdnControllerId().equals(SDN_CONTROLLER_ID);
    }

    @Test
    public void getAndSetName() throws Exception {
        String name = "name";
        portPairReq4N.setName(name);
        assert portPairReq4N.getName().equals(name);
    }

    @Test
    public void getAndSetDescription() throws Exception {
        String description = "description";
        portPairReq4N.setDescription(description);
        assert  portPairReq4N.getDescription().equals(description);
    }

    @Test
    public void getAndSetSfType() throws Exception {
        String sfType = "sfType";
        portPairReq4N.setSfType(sfType);
        assert portPairReq4N.getSfType().equals(sfType);
    }

    @Test
    public void isAndSetNshAware() throws Exception {
        boolean nshAware = false;
        portPairReq4N.setNshAware(nshAware);
        assert portPairReq4N.isNshAware() == nshAware;
    }

    @Test
    public void isAndSetRequestReclassification() throws Exception {
        boolean requestReclassification = false;
        portPairReq4N.setRequestReclassification(requestReclassification);
        assert portPairReq4N.isRequestReclassification() == requestReclassification;
    }

    @Test
    public void getAndSetIngress() throws Exception {
        PortInfo ingress = new PortInfo();
        portPairReq4N.setIngress(ingress);
        assert portPairReq4N.getIngress() == ingress;
    }

    @Test
    public void getAndSetEgress() throws Exception {
        PortInfo egress = new PortInfo();
        portPairReq4N.setEgress(egress);
        assert portPairReq4N.getEgress() == egress;
    }

    @Test
    public void getAndSetSfParam() throws Exception {
        HashMap sfParam = new HashMap();
        portPairReq4N.setSfParam(sfParam);
        assert portPairReq4N.getSfParam() == sfParam;
    }

    @Test
    public void getAndSetUrl() throws Exception {
        String url = "http://0.0.0.0:8080";
        portPairReq4N.setUrl(url);
        assert portPairReq4N.getUrl().equals(url);
    }

}