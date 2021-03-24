package com.study.mongo.business.service;


import com.study.mongo.business.dao.ServerManageRepository;
import com.study.mongo.business.pojo.ServerManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Li
 * @create 2021/3/18   10:22 下午
 */
@Service
public class ServerManageService {

    @Autowired
    private ServerManageRepository repository;

    @Autowired
    private MongoTemplate template;

    /**
     * 新增数据
     *
     * @param server
     * @return
     */
    public void saveServer(ServerManage server) {
        repository.save(server);
    }

    /**
     * 修改数据
     *
     * @param server
     */
    public void updateServer(ServerManage server) {
        repository.save(server);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public void delServerById(String id) {
        repository.deleteById(id);
    }

    /**
     * 查询所有
     *
     * @param
     */
    public List<ServerManage> getServerAll() {
        List<ServerManage> all = repository.findAll();
        return all;
    }

    /**
     * 修改数据
     *
     * @param id
     */
    public ServerManage getServerById(String id) {
        return repository.findById(id).get();
    }

    //===============================================develop==============================================//

    /**
     * 新增数据
     *
     * @param server
     * @return
     */
    public void addDevServer(ServerManage server) {
        repository.save(server);
    }

    /**
     * 新增数据
     *
     * @param server
     * @return
     */
    public void updateDevService(ServerManage server) {
        repository.save(server);
    }
}
