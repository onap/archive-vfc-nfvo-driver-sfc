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
public class SdnControllerInfoTest {
    SdnControllerInfo entity1;
    SdnControllerInfo entity2;

    @Before
    public void setUp() throws Exception {
        entity1 = new SdnControllerInfo();
        entity1.setPassword("");
        entity1.setUrl("");
        entity1.setUserName("");

        entity2 = new SdnControllerInfo();
        entity2.setPassword("");
        entity2.setUrl("");
        entity2.setUserName("");
    }

    @Test
    public void test() throws Exception {
        assert entity2.getPassword().equals(entity1.getPassword());
        assert entity2.getUrl().equals(entity1.getUrl());
        assert entity2.getUserName().equals(entity1.getUserName());
    }

    @Test
    public void equals() throws Exception {
        assert !entity2.equals(entity1);
        assert entity2.equals(entity2);
        assert entity2.hashCode() == entity2.hashCode();
        assert entity2.hashCode() != entity1.hashCode();
    }

    @Test
    public void toStringTest() throws Exception {
        assert entity2.toString() != null;
    }

}