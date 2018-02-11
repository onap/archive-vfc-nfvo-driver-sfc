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
    public void getAndSetIp_proto() throws Exception {
        String ip_proto = "ISIS";
        flowClassfierReq4N.setIp_proto(ip_proto);
        assert flowClassfierReq4N.getIp_proto().equals(ip_proto);
    }

    @Test
    public void getAndSetSource_port_range() throws Exception {
        String source_port_range = "1-400";
        flowClassfierReq4N.setSource_port_range(source_port_range);
        assert flowClassfierReq4N.getSource_port_range().equals(source_port_range);
    }

    @Test
    public void getAndSetDest_port_range() throws Exception {
        String dest_port_range = "1-400";
        flowClassfierReq4N.setDest_port_range(dest_port_range);
        assert flowClassfierReq4N.getDest_port_range().equals(dest_port_range);
    }

    @Test
    public void getAndSetSource_ip_range() throws Exception {
        String source_ip_range = "0.0.0.0-1.1.1.1";
        flowClassfierReq4N.setSource_ip_range(source_ip_range);
        assert flowClassfierReq4N.getSource_ip_range().equals(source_ip_range);
    }

    @Test
    public void getAndSetDest_ip_range() throws Exception {
        String dest_ip_range = "0.0.0.0-1.1.1.1";
        flowClassfierReq4N.setDest_ip_range(dest_ip_range);
        assert flowClassfierReq4N.getDest_ip_range().equals(dest_ip_range);
    }

}