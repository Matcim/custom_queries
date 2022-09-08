package co.develhope.Custom_Queries.pageandsort;

import co.develhope.Custom_Queries.entities.Flight;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PageAndSort extends PagingAndSortingRepository<Flight,Long> {


}
