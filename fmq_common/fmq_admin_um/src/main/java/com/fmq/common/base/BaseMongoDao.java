package com.fmq.common.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;

@Configuration
public class BaseMongoDao extends AbstractMongoConfiguration  {


	   private  Logger logger = LoggerFactory.getLogger(this.getClass());    
	   @Value("${mongodb.host}")    
	   private String mongodbHost;    
	   @Value("${mongodb.port}")    
	   private int mongodbPort;    
	   @Value("${mongodb.name}")    
	   private String mongodbName;    
	   @Value("${mongodb.user}")    
	   private String mongodbUser;    
	   @Value("${mongodb.password}")    
	   private String mongodbpwd;    
	   @Value("${mongodb.authentification}")    
	   private boolean authentification;    
	   @Bean
	   @Override
	   public MongoTemplate mongoTemplate() throws Exception {

	       MongoTemplate mongoTemplate = 
	           new MongoTemplate(mongo(), mongodbName);
	       logger.info("连接mongo ："+mongoTemplate.getDb().getName() +"  库");        return mongoTemplate;

	   }    
	   @Override
	   protected String getDatabaseName() {        
	       return mongodbName;
	   }    
	   @Override
	   public Mongo mongo() throws Exception {

	        MongoClient mongoClient;
	        MongoCredential credential = MongoCredential.createMongoCRCredential(mongodbUser,mongodbName,mongodbpwd.toCharArray());
	        MongoClientOptions options = MongoClientOptions.builder()
	               .connectionsPerHost(3000)
	               .threadsAllowedToBlockForConnectionMultiplier(10)
	               .readPreference(ReadPreference.nearest())
	               .build();
	       List<ServerAddress> addresses = new ArrayList<ServerAddress>();
	       String[] str = this.mongodbHost.split(",");        
	       for (String strHost : str) {
	         ServerAddress address = new ServerAddress(strHost, mongodbPort);
	         addresses.add(address);
	       }        
	       if(authentification){
	           mongoClient = new MongoClient(addresses,Arrays.asList(credential), options);
	       }else{
	            mongoClient = new MongoClient(addresses, options); 
	       }         return mongoClient;
	   }

}
