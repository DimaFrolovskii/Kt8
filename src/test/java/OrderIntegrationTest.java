
import com.example.OrderRepository;
import com.example.OrderService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderIntegrationTest {

    @Test
    @DisplayName("Интеграционный тест: создание заказа и запись в БД")
    void testCreateOrderIntegration() {
        OrderRepository repository = new OrderRepository();
        OrderService service = new OrderService(repository);

        // Проверяем работу связки Сервис + Репозиторий
        boolean created = service.createOrder("ORD-001", 1500.0);

        assertTrue(created, "Заказ должен успешно создаться");
        assertEquals(1500.0, repository.findById("ORD-001"), "Сумма в БД должна совпадать");
    }
}