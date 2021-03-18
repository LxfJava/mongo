package com.study.mongo.business.service;


import com.study.mongo.business.dao.ServerManagementRepository;
import com.study.mongo.business.pojo.ServerManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Li
 * @create 2021/3/18   10:22 下午
 */
@Service
public class ServerManagementService {

    @Autowired
    private ServerManagementRepository repository;

    /**
     * 新增数据
     *
     * @param server
     * @return
     */
    public void saveServer(ServerManagement server) {
        repository.save(server);
    }

    /**
     * 修改数据
     *
     * @param server
     */
    public void updateServer(ServerManagement server) {
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
    public List<ServerManagement> getServerAll() {
        List<ServerManagement> all = repository.findAll();
        return all;
    }

    /**
     * 修改数据
     *
     * @param id
     */
    public ServerManagement getServerById(String id) {
        return repository.findById(id).get();
    }


}
