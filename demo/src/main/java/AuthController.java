import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired private UserRepository userRepository;

    public AuthController() {
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }

     @GetMapping("/user/{id}")
     public ResponseEntity<User> getUserById(@PathVariable Long id) {
         return userRepository.findById(id).map(user -> ResponseEntity.ok(user))
                 .orElse(ResponseEntity.notFound().build());
     }

}
