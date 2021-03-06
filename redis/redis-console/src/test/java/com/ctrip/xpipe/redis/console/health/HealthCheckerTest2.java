package com.ctrip.xpipe.redis.console.health;

import com.ctrip.xpipe.redis.console.resources.DefaultMetaCache;
import com.ctrip.xpipe.redis.console.resources.MetaCache;
import com.ctrip.xpipe.redis.core.entity.DcMeta;
import com.ctrip.xpipe.redis.core.entity.XpipeMeta;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author chen.zhu
 * <p>
 * Feb 02, 2018
 */
public class HealthCheckerTest2 {

    private MetaCache metaCache = new DefaultMetaCache();

    private HealthChecker healthChecker = new HealthChecker();

    @Before
    public void beforeHealthCheckerTest2() {
        healthChecker.setMetaCache(metaCache);
    }

    @Test
    public void testWarmUp() {
        healthChecker.warmup();
    }
}
