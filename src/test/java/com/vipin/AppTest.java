package com.vipin;


import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.embedded.RedisExecProvider;
import redis.embedded.RedisServer;
import redis.embedded.util.Architecture;
import redis.embedded.util.OS;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

private RedisServer redisServer;


    @Test
    public void testSimpleRun() throws Exception {
        //File file = new File("/tmp/redisServer/redis-server-2.8.19");

       // redisServer = new RedisServer(file,6379);

        RedisExecProvider customProvider = RedisExecProvider.defaultProvider()
                .override(OS.UNIX, "/tmp/redisServer/redis-server-2.8.19")
                .override(OS.WINDOWS, Architecture.x86, "/path/to/windows/redis")
                .override(OS.MAC_OS_X, Architecture.x86, "/path/to/macosx/redis")
                .override(OS.MAC_OS_X, Architecture.x86_64, "/path/to/macosx/redis");

        //redisServer = new RedisServer(customProvider, 6379);
        redisServer = new RedisServer(6379);



        redisServer.start();
        Jedis jedis = new Jedis();
        System.out.print(jedis.ping());
        redisServer.stop();
    }
}
