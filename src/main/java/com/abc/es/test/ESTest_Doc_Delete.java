package com.abc.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * @author 030
 * @date 21:15 2021/8/22
 * @description
 */
public class ESTest_Doc_Delete {

    public static void main(String[] args) throws Exception{

        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http"))
        );

        // 删除数据，文档
        DeleteRequest request = new DeleteRequest();

        request.index("user").id("1001");

        DeleteResponse deleteResponse = esClient.delete(request, RequestOptions.DEFAULT);

        System.out.println(deleteResponse);

        esClient.close();

    }
}
