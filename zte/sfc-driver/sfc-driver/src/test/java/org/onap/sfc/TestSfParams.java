package org.onap.sfc;

import org.junit.Before;
import org.junit.Test;
import org.openo.sfc.entity.ChainParameter;
import org.openo.sfc.utils.SfcDriverUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: 10084662
 * Date: 17-9-19
 * Time: 下午3:37
 * To change this template use File | Settings | File Templates.
 */
public class TestSfParams {

    private final Logger LOGGER = LoggerFactory.getLogger(TestSfParams.class);

    @Test
    public void test_sfParams()
    {
        SfcDriverUtil.generateSfParams(new HashMap());
    }

    @Test
    public void test_generateChainParams()
    {
        String key = "chain-parameter";
        String value = "chain-parameter-value";
        ChainParameter chainParameter = SfcDriverUtil.generateChainParam(key,value);

        assert chainParameter.getChainParameter().equals(key);
        assert chainParameter.getChainParamValue().equals(value);
    }

    @Before
    public void setupBefore()
    {

    }
}
