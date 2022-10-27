package maute.brothers.splitsquare.users;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends MongoRepository<AdminUser, String> {
}
