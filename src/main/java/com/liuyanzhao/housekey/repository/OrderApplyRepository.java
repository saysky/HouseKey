package com.liuyanzhao.housekey.repository;

import com.liuyanzhao.housekey.entity.House;
import com.liuyanzhao.housekey.entity.LookApply;
import com.liuyanzhao.housekey.entity.OrderApply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * @author θ¨ζ
 * @date 2022/1/2 8:49 δΈε
 */

public interface OrderApplyRepository extends CrudRepository<OrderApply, Integer> {
    Page<OrderApply> findAll(Pageable pageable);

}
