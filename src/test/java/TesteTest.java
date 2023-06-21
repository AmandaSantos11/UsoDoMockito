import org.example.Teste;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;
import java.util.Scanner;

@MockitoSettings
public class TesteTest {
    @InjectMocks
    private Teste teste;
    @Mock
    private Scanner scanner;

    @Test
    public void testeDoScanner(){
        Mockito.when(scanner.nextLine()).thenReturn("amanda");
        String nome = teste.digiteSeuNome(scanner);
        Assertions.assertEquals("amanda",nome);
    }
}
