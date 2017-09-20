/**
 * Copyright 2016 [ZTE] and others.
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
import org.openo.sfc.entity.FlowClassfierReq4N;
import org.openo.sfc.utils.SfcDriverUtil;
import org.openo.sfc.wrapper.N2sReqWrapper;

public class TestFlowClassifier {

    @Test
    public void test_convertFlowClassfier()
    {
        FlowClassfierReq4N flowClassfierReq4N = new FlowClassfierReq4N();
        flowClassfierReq4N.setUrl("http://127.0.0.1:8181");
        N2sReqWrapper.convertFlowClassfier(flowClassfierReq4N);
    }
    @Test
    public void test_Object2Json()
    {
        FlowClassfierReq4N flowClassfierReq4N = new FlowClassfierReq4N();
        SfcDriverUtil.toJson(flowClassfierReq4N);
    }

    @Before
    public void setupBeforeTest()
    {

    }
}
