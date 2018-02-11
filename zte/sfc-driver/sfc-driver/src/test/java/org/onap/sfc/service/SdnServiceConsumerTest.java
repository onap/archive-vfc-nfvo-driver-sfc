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
package org.onap.sfc.service;

import org.junit.Test;

public class SdnServiceConsumerTest {

    public static final String URL = "http://127.0.0.1:8080";

    @Test
    public void getSdnConProxy() throws Exception {
        ISdnControllerService sdnConProxy = SdnServiceConsumer.getSdnConProxy(URL);
        assert sdnConProxy != null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSdnConProxyException() throws Exception {
        SdnServiceConsumer.getSdnConProxy("");
    }

    @Test
    public void getMsbRegisterService() throws Exception {
        MsbService msbRegisterService = SdnServiceConsumer.getMsbRegisterService(URL);
        assert msbRegisterService != null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMsbRegisterServiceException() throws Exception {
        SdnServiceConsumer.getMsbRegisterService("");
    }
}