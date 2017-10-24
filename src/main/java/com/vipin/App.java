package com.vipin;

import redis.clients.jedis.Jedis;
import redis.embedded.RedisServer;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        System.out.println( "Hello World!" );
        RedisServer redisServer = new RedisServer(6379);
        Jedis jedis = new Jedis();
        redisServer.start();
        System.out.print(jedis.ping());

        redisServer.stop();
    }
}
