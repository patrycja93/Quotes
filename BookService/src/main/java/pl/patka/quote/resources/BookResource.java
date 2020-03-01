package pl.patka.quote.resources;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patka.quote.config.BookConfiguration;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookResource {

  private final BookConfiguration bookConfiguration;

  @GetMapping("/books")
  public List<String> getBooks(){
  	  return bookConfiguration.getBooks();
  }
}
