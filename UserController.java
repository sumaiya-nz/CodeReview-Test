@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository; // This is the architectural trap
}
