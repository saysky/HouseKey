package com.liuyanzhao.housekey.repository;

import com.liuyanzhao.housekey.entity.KeyApply;
import com.liuyanzhao.housekey.entity.LookApply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * @author θ¨ζ
 * @date 2022/1/2 8:49 δΈε
 */

public interface KeyApplyRepository extends CrudRepository<KeyApply, Integer> {
    Page<KeyApply> findAll(Pageable pageable);
}
