import com.lauramititelu.spring.drugstore.service.DrugService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DrugService service = appContext.getBean(DrugService.class);

        service.printAll();
        System.out.println("Medium price " + service.mediumPrice());
    }
}
