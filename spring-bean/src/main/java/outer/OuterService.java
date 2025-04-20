package outer;

import org.springframework.stereotype.Component;

@Component
public class OuterService {
    OuterService(){
        System.out.println("outer");
    }
}
