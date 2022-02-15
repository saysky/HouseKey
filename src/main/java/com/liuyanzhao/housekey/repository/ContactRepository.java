package com.liuyanzhao.housekey.repository;

import com.liuyanzhao.housekey.entity.Contact;
import com.liuyanzhao.housekey.entity.KeyApply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 言曌
 * @date 2022/1/2 8:49 下午
 */

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    Page<Contact> findAll(Pageable pageable);

}
