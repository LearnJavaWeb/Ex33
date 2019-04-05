package thinhluffy.com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thinhluffy.com.model.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {
}
