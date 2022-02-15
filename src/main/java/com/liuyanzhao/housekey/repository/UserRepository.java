package com.liuyanzhao.housekey.repository;

import com.liuyanzhao.housekey.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 言曌
 * @date 2022/1/2 8:49 下午
 */

public interface UserRepository extends CrudRepository<User, Integer> {


    User findByUsername(String username);
}
