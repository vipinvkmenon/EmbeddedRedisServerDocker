package com.vipin;


import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.embedded.RedisServer;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

private RedisServer redisServer;
    ;

    @Test
    public void testSimpleRun() throws Exception {
        File file = new File("/tmp/redisServer/redis-server-2.8.19");
        redisServer = new RedisServer(file,6379);

        redisServer.start();
        Jedis jedis = new Jedis();
        System.out.print(jedis.ping());
        redisServer.stop();
    }
}
