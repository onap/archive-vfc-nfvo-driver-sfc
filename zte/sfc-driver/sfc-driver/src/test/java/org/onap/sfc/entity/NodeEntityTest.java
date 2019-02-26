package org.onap.sfc.entity;

import org.junit.Before;
import org.junit.Test;

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
public class NodeEntityTest {
    NodeEntity entity1;
    NodeEntity entity2;

    @Before
    public void setUp() throws Exception {
        entity1 = new NodeEntity();
        entity1.setIp("");
        entity1.setPort("");
        entity1.setTtl("");

        entity2 = new NodeEntity();
        entity2.setIp("");
        entity2.setPort("");
        entity2.setTtl("");
    }

    @Test
    public void test() throws Exception {
        assert entity2.getIp().equals(entity1.getIp());
        assert entity2.getPort().equals(entity1.getPort());
        assert entity2.getTtl().equals(entity1.getTtl());
    }

    @Test
    public void equals() throws Exception {
        assert !entity2.equals(entity1);
        assert entity2.equals(entity2);
    }

    @Test
    public void toStringTest() throws Exception {
        assert entity2.toString() != null;
    }

}