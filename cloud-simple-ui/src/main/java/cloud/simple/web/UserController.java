

package cloud.simple.web;

import cloud.simple.model.User;
import cloud.simple.service.IUserService;
import cloud.simple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;


    @Autowired
    IUserService iuserService;


    @RequestMapping(value = "/users")
    public ResponseEntity<List<User>> readUserInfo() {
        List<User> users = userService.readUserInfo();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/test1")
    public ResponseEntity<List<User>> test1() {
        List<User> users = iuserService.readUserInfo();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}
