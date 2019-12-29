package com.atyzu.gmall.manage;

import com.sun.demo.jvmti.hprof.Tracker;
import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManageWebApplicationTests {

	@Test
	public void contextLoads() throws IOException, MyException {
		//配置fdfs的全局链接地址
		//获得配置文件的路径
		String tracker = GmallManageWebApplicationTests.class.getResource("/tracker.conf").getPath();
		//加载配置文件
		ClientGlobal.init(tracker);
		//创建一个TrackerClient对象
		TrackerClient trackerClient = new TrackerClient();
		//使用trackerClient对象获取trackerServer对象
		TrackerServer trackerServer = trackerClient.getConnection();
		//创建一个StorageServer的引用null就可以
		StorageServer storageServer = null;
		//创建一个StorageClient对象，trackerServer和storageServer两个对象
		StorageClient storageClient = new StorageClient(trackerServer,storageServer);
		//使用StorageClient对象上传文件
		String[] upload_file = storageClient.upload_file("C:/Users/顾秀坚/Pictures/Saved Pictures/0b2163c04129efba5ac13f00269477b0.jpg", "jpg", null);

		String url = "http://192.168.123.150";
		for (String s : upload_file) {
			url += "/"+s;
		}
		System.out.println(url);




	}

}
