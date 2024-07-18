package dio.web.api.Repository;

import dio.web.api.Model.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User User){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(User);
    }
    public void update(User User){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(User);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> listAll(){
        List<User> Users = new ArrayList<>();
        Users.add(new User("fulano","password"));
        Users.add(new User("siclano","masterpass"));
        return Users;
    }
    public User finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("fulano","password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("GET/username - Recebendo o username: %d para localizar um usuário", username));
        return new User("fulano","password");
    }

}
