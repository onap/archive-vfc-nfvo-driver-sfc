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
package org.onap.sfc.entity;

import com.google.gson.annotations.SerializedName;

public class ChainParameter {
    @SerializedName("chain-parameter")
    private String chainParam;//A field should not duplicate the name of its containing class
    @SerializedName("chain-parameter-value")
    private String chainParamValue;

    public String getChainParameter() {
        return chainParam;
    }

    public void setChainParameter(String inChainParameter) {
        this.chainParam = inChainParameter;
    }

    public String getChainParamValue() {
        return chainParamValue;
    }

    public void setChainParamValue(String chainParamValue) {
        this.chainParamValue = chainParamValue;
    }


}
