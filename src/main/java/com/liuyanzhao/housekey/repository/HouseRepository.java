package com.liuyanzhao.housekey.repository;

import com.liuyanzhao.housekey.entity.House;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 言曌
 * @date 2022/1/2 8:49 下午
 */

public interface HouseRepository extends CrudRepository<House, Integer> {

    Page<House> findByCategoryId(Integer categoryId, Pageable pageable);

    Page<House> findByArea(String area, Pageable pageable);


    Page<House> findAll(Specification<House> specification, Pageable pageable);
    Page<House> findAll(Pageable pageable);

    Page<House> findByDizhiLikeOrContentLike(String dizhi,  String content, Pageable pageable);

}
