/**
 * Copyright 2017 ZTE Corporation.
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

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SfcDriverConfigTest {

    public static final String TEMPLATE = "template";
    public static final String DEFAULT = "default";
    public static final String URL = "http://0.0.0.0:8080";
    SfcDriverConfig sfcDriverConfig;

    @Before
    public void setUp() {
        sfcDriverConfig = new SfcDriverConfig();
    }

    @Test
    public void getAndSetTemplate() throws Exception {
        sfcDriverConfig.setTemplate(TEMPLATE);
        String template = sfcDriverConfig.getTemplate();
        assert template.equals(TEMPLATE);
    }

    @Test
    public void getDefaultName() throws Exception {
        assert sfcDriverConfig.getDefaultName() != null;
    }

    @Test
    public void setDefaultName() throws Exception {
        sfcDriverConfig.setDefaultName(DEFAULT);
        assert sfcDriverConfig.getDefaultName().equals(DEFAULT);
    }

    @Test
    public void getAndSetMsbServiceUrl() throws Exception {
        sfcDriverConfig.setMsbServiceUrl(URL);
        assert sfcDriverConfig.getMsbServiceUrl().equals(URL);
    }

}