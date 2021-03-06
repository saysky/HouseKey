package com.liuyanzhao.housekey.repository;

import com.liuyanzhao.housekey.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author θ¨ζ
 * @date 2022/1/2 8:49 δΈε
 */

public interface UserRepository extends CrudRepository<User, Integer> {


    User findByUsername(String username);
}
