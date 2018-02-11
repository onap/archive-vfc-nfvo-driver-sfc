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
package org.onap.sfc;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.junit.Before;
import org.junit.Test;

public class SfcDriverTest {
    SfcDriver sfcDriver;

    @Before
    public void setUp() throws Exception {
        sfcDriver = new SfcDriver();
    }

    @Test
    public void getName() throws Exception {
        assert sfcDriver.getName() != null;
    }

    @Test
    public void initialize() throws Exception {
        Application<SfcDriverConfig> application = new Application<SfcDriverConfig>() {
            @Override
            public void run(SfcDriverConfig sfcDriverConfig, Environment environment) throws Exception {
                System.out.println("Hallo onap!");
            }
        };
        Bootstrap<SfcDriverConfig> bootstrap = new Bootstrap<>(application);
        sfcDriver.initialize(bootstrap);
    }

}