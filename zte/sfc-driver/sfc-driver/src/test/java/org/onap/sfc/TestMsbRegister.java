package org.onap.sfc;

import org.junit.Before;
import org.junit.Test;
import org.openo.sfc.entity.MsbRegisterEntity;
import org.openo.sfc.utils.SfcDriverUtil;

/**
 * Created with IntelliJ IDEA.
 * User: 10084662
 * Date: 17-9-19
 * Time: 下午1:58
 * To change this template use File | Settings | File Templates.
 */
public class TestMsbRegister {
    @Test
    public void test_registerMsb()
    {
        MsbRegisterEntity entity = SfcDriverUtil.getMsbRegisterInfo();
        assert entity.getUrl().equals("/openoapi/ztesdncdriver/v1");
    }

    @Before
    public void setupBefore()
    {

    }
}
