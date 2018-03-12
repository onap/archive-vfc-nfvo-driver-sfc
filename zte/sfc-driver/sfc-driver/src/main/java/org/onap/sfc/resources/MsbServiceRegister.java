/**
 * Copyright 2016 ZTE Corporation.
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

import org.onap.sfc.utils.SfcDriverUtil;
import org.onap.sfc.entity.MsbRegisterEntity;
import org.onap.sfc.service.ConfigInfo;
import org.onap.sfc.service.SdnServiceConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MsbServiceRegister implements Runnable {
    private final Logger LOGGER = LoggerFactory.getLogger(MsbServiceRegister.class);
    MsbRegisterEntity entity;
    public MsbServiceRegister()
    {
        initInfo();
    }

    private void initInfo()
    {
        entity = SfcDriverUtil.getMsbRegisterInfo();

    }

    @Override
    public void run() {
        boolean flag = false;
        int retryTimes=0;
        while (!flag && retryTimes<20)
        {
            try {
                LOGGER.info("Register Msb start:");
                LOGGER.info(SfcDriverUtil.toJson(entity));
                SdnServiceConsumer.getMsbRegisterService(ConfigInfo.getConfig().getMsbServiceUrl()).
                        registerServce("false",entity);
                LOGGER.info("Register Msb end:");
                flag = true;
                break;
            } catch (Exception e) {
                LOGGER.error("Register Msb failed",e);
                //e.printStackTrace();
                threadSleep(30000);
            }
        }

    }

    private void threadSleep(int second) {
        LOGGER.info("start sleep ....");
        try {
            Thread.sleep(second);
        } catch (Exception e) {
            LOGGER.error("thread sleep error.errorMsg:", e);
        }
        LOGGER.info("sleep end .");
    }
}
