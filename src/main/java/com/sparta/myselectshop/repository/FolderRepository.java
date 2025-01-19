package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FolderRepository extends CrudRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    // select * from folder where user_id = ? and name in (?,?,?);

    List<Folder> findAllByUser(User user);


}
