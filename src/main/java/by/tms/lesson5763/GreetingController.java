package by.tms.lesson5763;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simon Pirko on 27.06.23
 */

@RestController
@RequestMapping("/")
public class GreetingController {

  @GetMapping
  public ResponseEntity<String> greeting(String name) {
    return ResponseEntity.ok("Hello " + name);
  }
}
