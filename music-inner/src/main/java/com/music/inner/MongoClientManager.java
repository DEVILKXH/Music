package com.music.inner;

import java.io.IOException;
import java.util.Properties;

import org.bson.Document;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class MongoClientManager {
	
	private static String host = null;
	private static int port = 0;
	private static String database = null;
	private static String collection = null;
	
	private static MongoClient mongoClient = null;
	
	private static  MongoDatabase mongoDatabase = null;
	
	private static  MongoCollection<Document> mongoCollection = null;
	
	static {
		Properties prop = new Properties();
		try {
			prop.load(PropertiesLoaderUtils.class.getClassLoader().getResourceAsStream("mongodb.properties"));
			host = prop.get("mongo.host").toString();
			port = Integer.parseInt(prop.get("mongo.port").toString());
			database = prop.getProperty("mongo.database").toString();
			collection = prop.getProperty("mongo.collection").toString();
			System.out.println(host);
			System.out.println(port);
			System.out.println(database);
			System.out.println(collection);
			mongoClient = new MongoClient(host,port);
			mongoDatabase = mongoClient.getDatabase(database);
			mongoCollection = mongoDatabase.getCollection(collection);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public FindIterable<Document> find(){
		return mongoCollection.find();
	}
	
	public long count(){
		return mongoCollection.count();
	}
	
	public static void main(String []args){
		new MongoClientManager();
	}
}
