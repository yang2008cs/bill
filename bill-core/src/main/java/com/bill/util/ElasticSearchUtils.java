package com.bill.util;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ElasticSearchUtils {

    /**
     * 构建Settings 对象
     */
    private static Settings settings = Settings.builder().put("cluster.name", "elasticsearch")
            .put("client.transport.sniff", true).put("node.name","first_node")
            .build();
    /**
     * TransportClient 对象, 用于连接ES集群
     */
    private static volatile TransportClient client;

    private final static String article="article";
    private final static String content="content";

    /**
     * 同步synchronized(*.class)代码块的作用和synchronized static方法作用一样,
     * 对当前对应的*.class 进行持锁, static方法和.class 一样都是锁的该类本身,同一个监听器
     *
     * @return
     */
    public static TransportClient getClient() {
        if (client == null) {
            synchronized (TransportClient.class) {
                client = new PreBuiltTransportClient(settings);
                try {
                    /*String[] allHost = host.split(",");
                    for (String str : allHost) {*/
                        client.addTransportAddresses(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
                   /* }*/
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
            }
        }
        return client;
    }


    public static void crateIndex(String jsonStr, String type) {
        try {
            if(client == null){
                client = getClient();
            }
            IndexResponse response = client.prepareIndex("bill", type)
                    .setSource(jsonStr, XContentType.JSON)
                    .get();
            System.out.println("添加索引成功,版本号："+response.getVersion());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public void CreateIndexAndMapping() throws Exception{

        CreateIndexRequestBuilder  cib=client.admin().indices().prepareCreate(article);
        XContentBuilder mapping = XContentFactory.jsonBuilder()
                .startObject()
                .startObject("properties") //设置自定义字段
                .startObject("author")
                .field("type","string") //设置数据类型
                .endObject()
                .startObject("title")
                .field("type","string")
                .endObject()
                .startObject("content")
                .field("type","string")
                .endObject()
                .startObject("price")
                .field("type","string")
                .endObject()
                .startObject("view")
                .field("type","string")
                .endObject()
                .startObject("tag")
                .field("type","string")
                .endObject()
                .startObject("date")
                .field("type","date")  //设置Date类型
                .field("format","yyyy-MM-dd HH:mm:ss") //设置Date的格式
                .endObject()
                .endObject()
                .endObject();
        cib.addMapping(content, mapping);

        CreateIndexResponse res=cib.execute().actionGet();

        System.out.println("----------添加映射成功----------");
    }*/


}
