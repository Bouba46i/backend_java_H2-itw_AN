package test.bastianb.alphanetworkstest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.bastianb.alphanetworkstest.models.User;

//@RepositoryRestRessource(path = "user")
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
