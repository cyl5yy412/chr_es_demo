//package com.chryl.config;
//
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
///**
// * @Author: mzd
// * @Date: 2021/1/19 17:27
// */
//@Component
//public class ElasticClientConfig {
//
//    @Bean("restHighLevelClient")
//    public RestHighLevelClient getRestHighLevelClient() {
//        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(RestClient.builder(new HttpHost("127.0.0.1", 9200)));
//        return restHighLevelClient;
//    }
//
////    @Bean("restHighLevelClient")
////    public RestHighLevelClient getRestHighLevelClient() {
////        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(RestClient.builder(new HttpHost("192.168.1.122", 9201),
////                new HttpHost("192.168.1.122", 9202), new HttpHost("192.168.1.122", 9203)));
////        return restHighLevelClient;
////    }
//
//}
