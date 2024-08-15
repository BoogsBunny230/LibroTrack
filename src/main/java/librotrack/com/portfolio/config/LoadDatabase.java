package librotrack.com.portfolio.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import librotrack.com.portfolio.model.Book;
import librotrack.com.portfolio.repository.BookRepository;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            System.out.println("Cargando datos iniciales en la base de datos...");

            repository.saveAll(List.of(
                new Book("La Divina Comedia", "Dante Alighieri", "1234567890", 150.99),
                new Book("1984", "George Orwell", "1234567891", 100.99),
                new Book("El principito", "Antoine de Saint-Exupéry", "1234567892", 80.99),
                new Book("Cien años de soledad", "Gabriel García Márquez", "1234567893", 120.99),
                new Book("Don Quijote de la Mancha", "Miguel de Cervantes", "1234567894", 140.99),
                new Book("Orgullo y prejuicio", "Jane Austen", "1234567896", 90.99)
            ));

            System.out.println("Datos iniciales cargados exitosamente.");
        };
    }
}
