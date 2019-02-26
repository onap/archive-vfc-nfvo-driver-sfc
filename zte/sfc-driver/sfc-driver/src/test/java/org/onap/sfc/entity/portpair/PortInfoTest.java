package org.onap.sfc.entity.portpair;

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
public class PortInfoTest {
    PortInfo portInfo1;
    PortInfo portInfo2;

    @Before
    public void setUp() throws Exception {
        portInfo1 = new PortInfo();
        portInfo1.setEncapsulation("");
        portInfo1.setIp("");
        portInfo1.setMac("");
        portInfo1.setPortName("");

        portInfo2 = new PortInfo();
        portInfo2.setEncapsulation("");
        portInfo2.setIp("");
        portInfo2.setMac("");
        portInfo2.setPortName("");
    }

    @Test
    public void test() throws Exception {
        assert portInfo1.getEncapsulation().equals(portInfo2.getEncapsulation());
        assert portInfo1.getIp().equals(portInfo2.getIp());
        assert portInfo1.getMac().equals(portInfo2.getMac());
        assert portInfo1.getPortName().equals(portInfo2.getPortName());
    }

    @Test
    public void equals() throws Exception {
        assert !portInfo2.equals(portInfo1);
        assert portInfo2.equals(portInfo2);
    }

    @Test
    public void toStringTest() throws Exception {
        assert portInfo2.toString() != null;
    }

}