package uk.co.aduffy.persistance.aws;


import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

/**
 * Provides connection to dynamodb database.
 * Stub class until this is replaced with CDI based approach
 * @author Andrew Duffy
 *
 */
public class DynamoDBDataSource {

	public AmazonDynamoDB getConnection() {
		return AmazonDynamoDBClientBuilder.standard()
											.withRegion(Regions.EU_WEST_1.getName())
											.build();
	}
	
	public DynamoDB getClientConnection() {
		return new DynamoDB(getConnection());
	}
	
}
