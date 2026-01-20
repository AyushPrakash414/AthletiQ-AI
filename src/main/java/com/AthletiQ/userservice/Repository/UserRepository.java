package com.AthletiQ.userservice.Repository;

import com.AthletiQ.userservice.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>
    //JPA Repossitory is the interface is used to inrect with the relational databases
    // for mongoDB it uses the atlas supports docunment ans the collection  so it is not used
{
     boolean existsByEmail(String email);
}
