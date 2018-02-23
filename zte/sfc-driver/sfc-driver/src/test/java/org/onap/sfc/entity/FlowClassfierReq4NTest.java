/*
 * Copyright 2018 ZTE Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onap.sfc.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlowClassfierReq4NTest {
    FlowClassfierReq4N flowClassfierReq4N;

    @Before
    public void setUp() throws Exception {
        flowClassfierReq4N = new FlowClassfierReq4N();
    }

    @Test
    public void getAndSetUrl() throws Exception {
        String url = "http://0.0.0.0:8080";
        flowClassfierReq4N.setUrl(url);
        assert flowClassfierReq4N.getUrl().equals(url);
    }

    @Test
    public void getAndSetSdnControllerId() throws Exception {
        String sdnControllerId = "123-456-789";
        flowClassfierReq4N.setSdnControllerId(sdnControllerId);
        assert flowClassfierReq4N.getSdnControllerId().equals(sdnControllerId);
    }

    @Test
    public void getAndSetName() throws Exception {
        String name = "name";
        flowClassfierReq4N.setName(name);
        assert flowClassfierReq4N.getName().equals(name);
    }

    @Test
    public void getAndSetDescription() throws Exception {
        String description = "description";
        flowClassfierReq4N.setDescription(description);
        assert  flowClassfierReq4N.getDescription().equals(description);
    }

    @Test
    public void getAndSetDscp() throws Exception {
        int dscp = 0;
        flowClassfierReq4N.setDscp(dscp);
        assert flowClassfierReq4N.getDscp() == dscp;
    }

    @Test
    public void getAndSetIpProto() throws Exception {
        String ipProto = "ISIS";
        flowClassfierReq4N.setIpProto(ipProto);
        assert flowClassfierReq4N.getIpProto().equals(ipProto);
    }

    @Test
    public void getAndSetSourcePortRange() throws Exception {
        String sourcePortRange = "1-400";
        flowClassfierReq4N.setSourcePortRange(sourcePortRange);
        assert flowClassfierReq4N.getSourcePortRange().equals(sourcePortRange);
    }

    @Test
    public void getAndSetDestPortRange() throws Exception {
        String destPortRange = "1-400";
        flowClassfierReq4N.setDestPortRange(destPortRange);
        assert flowClassfierReq4N.getDestPortRange().equals(destPortRange);
    }

    @Test
    public void getAndSetSourceIpRange() throws Exception {
        String sourceIpRange = "0.0.0.0-1.1.1.1";
        flowClassfierReq4N.setSourceIpRange(sourceIpRange);
        assert flowClassfierReq4N.getSourceIpRange().equals(sourceIpRange);
    }

    @Test
    public void getAndSetDestIpRange() throws Exception {
        String destIpRange = "0.0.0.0-1.1.1.1";
        flowClassfierReq4N.setDestIpRange(destIpRange);
        assert flowClassfierReq4N.getDestIpRange().equals(destIpRange);
    }

}
