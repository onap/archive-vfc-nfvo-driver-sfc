package org.onap.sfc;

import org.junit.Before;
import org.junit.Test;
import org.openo.sfc.utils.SfcDriverUtil;

/**
 * Created with IntelliJ IDEA.
 * User: 10084662
 * Date: 17-9-19
 * Time: 下午2:33
 * To change this template use File | Settings | File Templates.
 */
public class TestAuthorization {
    @Test
    public void test_authorization()
    {
        String authoInfo = SfcDriverUtil.generateAuthorization();
        assert !authoInfo.equals("") ;
    }

    @Before
    public void setupBefore()
    {

    }
}
