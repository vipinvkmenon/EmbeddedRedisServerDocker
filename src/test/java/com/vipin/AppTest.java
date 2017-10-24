package com.vipin;


import org.junit.Test;
import redis.embedded.RedisServer;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

private RedisServer redisServer;
    ;

    @Test
    public void testSimpleRun() throws Exception {
        redisServer = new RedisServer(6379);
        redisServer.start();

        redisServer.stop();
    }
}
