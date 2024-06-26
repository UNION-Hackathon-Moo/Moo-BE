package com.example.moo.service;

import com.example.moo.dto.ProductListResponse;
import com.example.moo.external.ProductScraper;
import java.io.IOException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductListService {

  private final ProductScraper productScrapper;

  public List<ProductListResponse> findProduct(String keyword) throws IOException, ParseException {
    List<ProductListResponse> productListResponseList = productScrapper.scrapeList(keyword);
    return productListResponseList;
  }
}