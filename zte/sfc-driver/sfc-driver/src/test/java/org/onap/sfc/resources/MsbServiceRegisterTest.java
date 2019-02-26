package org.onap.sfc.resources;

import org.junit.Test;
import org.onap.sfc.SfcDriverConfig;
import org.onap.sfc.service.ConfigInfo;

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
public class MsbServiceRegisterTest {
    @Test
    public void run() throws Exception {
        SfcDriverConfig sfcDriverConfig = new SfcDriverConfig();
        sfcDriverConfig.setServiceIp("127.0.0.1");
        sfcDriverConfig.setMsbServiceUrl("http://127.0.0.0:21180/microservices");
        ConfigInfo.setConfig(sfcDriverConfig);
        MsbServiceRegister msbServiceRegister = new MsbServiceRegister();
        msbServiceRegister.setSleepSeconds(1);
        msbServiceRegister.setRetry(1);
        msbServiceRegister.run();
    }

}