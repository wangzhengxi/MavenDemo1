import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * Created by wangzhengxi on 2018/4/25.
 */
public class MongoTest {
    public static void main( String args[] ){
        try{
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient( "172.16.124.132" , 27017 );

            // 连接到数据库
            MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");

            System.out.println("连接成功");

            mongoDatabase.createCollection("con11");
            System.out.println("集合创建成功");

        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
