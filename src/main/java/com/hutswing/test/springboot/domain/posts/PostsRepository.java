package com.hutswing.test.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SeLCE p Frome Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}

