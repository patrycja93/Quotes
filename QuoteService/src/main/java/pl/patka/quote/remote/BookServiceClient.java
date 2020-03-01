package pl.patka.quote.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("book-service")
public interface BookServiceClient {
  @GetMapping("/books")
  List<String> getBooks();
}
