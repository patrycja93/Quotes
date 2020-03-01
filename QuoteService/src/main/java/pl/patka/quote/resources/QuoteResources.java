package pl.patka.quote.resources;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patka.quote.remote.BookServiceClient;

import java.util.List;
import java.util.Random;

@RestController
@RequiredArgsConstructor
public class QuoteResources {

  private final BookServiceClient bookServiceClient;

  @GetMapping("/quotes")
  public ResponseEntity<String> getQuote(){
    List<String> books = bookServiceClient.getBooks();
    int bound = books.size();
    int random = new Random().nextInt(bound);
    String quote = books.get(random);
    return ResponseEntity.ok(quote);
  }
}
