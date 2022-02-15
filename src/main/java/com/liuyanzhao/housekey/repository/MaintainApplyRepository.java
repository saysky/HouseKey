package com.liuyanzhao.housekey.repository;

import com.liuyanzhao.housekey.entity.LookApply;
import com.liuyanzhao.housekey.entity.MaintainApply;
import com.liuyanzhao.housekey.entity.OrderApply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 言曌
 * @date 2022/1/2 8:49 下午
 */

public interface MaintainApplyRepository extends CrudRepository<MaintainApply, Integer> {
    Page<MaintainApply> findAll(Pageable pageable);

}
