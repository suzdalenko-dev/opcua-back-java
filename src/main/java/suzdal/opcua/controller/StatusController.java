package suzdal.opcua.controller;

import java.time.Instant;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class StatusController{

   @GetMapping("/status")
   public Map<String, Object> getStatus(){
    return Map.of(
        "application", "first",
        "status", "runnig",
        "timestump", Instant.now().toString()
    );
   } 
} 



