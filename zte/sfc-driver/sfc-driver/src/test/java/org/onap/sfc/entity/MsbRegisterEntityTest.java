package org.onap.sfc.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
public class MsbRegisterEntityTest {
    MsbRegisterEntity entity1;
    MsbRegisterEntity entity2;
    List<NodeEntity> nodes = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
        entity1 = new MsbRegisterEntity();
        entity1.setServiceName("serviceName");
        entity1.setNodes(nodes);
        entity1.setProtocol("http");
        entity1.setUrl("http://127.0.0.1");
        entity1.setVersion("1.0");
        entity1.setVisualRange("0-6");

        entity2 = new MsbRegisterEntity();
        entity2.setVisualRange(entity1.getVisualRange());
        entity2.setVersion(entity1.getVersion());
        entity2.setUrl(entity1.getUrl());
        entity2.setServiceName(entity1.getServiceName());
        entity2.setNodes(entity1.getNodes());
        entity2.setProtocol(entity1.getProtocol());
    }

    @Test
    public void test() throws Exception {
        assert entity2.getNodes().equals(entity1.getNodes());
        assert entity2.getProtocol().equals(entity1.getProtocol());
        assert entity2.getServiceName().equals(entity1.getServiceName());
        assert entity2.getUrl().equals(entity1.getUrl());
        assert entity2.getVersion().equals(entity1.getVersion());
        assert entity2.getVisualRange().equals(entity1.getVisualRange());
    }


    @Test
    public void equals() throws Exception {
        assert !entity2.equals(entity1);
        assert entity2.equals(entity2);
        assert entity2.hashCode() == entity2.hashCode();
        assert entity2.hashCode() != entity1.hashCode();
    }

    @Test
    public void toStringTest() {
        assert entity2.toString() != null;
    }

}