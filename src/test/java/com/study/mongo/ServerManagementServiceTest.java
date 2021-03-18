package com.study.mongo;

import com.study.mongo.business.pojo.ServerManagement;
import com.study.mongo.business.service.ServerManagementService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Li
 * @create 2021/3/18   11:03 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerManagementServiceTest {

    private ServerManagementService db;

    @Test
    void test1(){
        ServerManagement ogj1 = new ServerManagement("1", "服务器001", "windows", "127.0.0.1",
                "192.168.0.1", "80", "MG", "1");
        db.saveServer(ogj1);
        ServerManagement ogj2 =new ServerManagement("2","服务器001","windows","127.0.0.1",
                "192.168.0.2","90","WG","1");
        db.saveServer(ogj2);
        ServerManagement ogj3 =new ServerManagement("3","服务器001","windows","127.0.0.1",
                "192.168.0.3","100","BG","1");
        db.saveServer(ogj3);
        ServerManagement ogj4 =new ServerManagement("4","服务器001","windows","127.0.0.1",
                "192.168.0.4","180","ZG","1");
        db.saveServer(ogj4);
        ServerManagement ogj5 = new ServerManagement("5","服务器001","windows","127.0.0.1",
                "192.168.0.5","280","SG","1");
        db.saveServer(ogj5);
        ServerManagement ogj6 =new ServerManagement("6","服务器001","windows","127.0.0.1",
                "192.168.0.6","380","EG","1");
        db.saveServer(ogj6);
    }

    @Test
    void test2(){
        ServerManagement ogj1 = new ServerManagement("1", "服务器001", "windows", "127.0.0.1",
                "0.0.0.0", "00", "MG", "10000");
        db.updateServer(ogj1);
    }

    @Test
    void test3(){
        ServerManagement ogj1 = new ServerManagement("1", "服务器001", "windows", "127.0.0.1",
                "0.0.0.0", "00", "MG", "10000");
        db.updateServer(ogj1);
    }
}
