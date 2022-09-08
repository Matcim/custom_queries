package co.develhope.Custom_Queries.entities;

import org.springframework.data.domain.Sort;

public class PagingFlight {

    private int pageNumer = 0;
    private int getPageNumer = 2;
    private Sort.Direction direction = Sort.Direction.ASC;
    private String sortBy = "fromAirport";


    public int getPageNumer() {
        return pageNumer;
    }

    public void setPageNumer(int pageNumer) {
        this.pageNumer = pageNumer;
    }

    public int getGetPageNumer() {
        return getPageNumer;
    }

    public void setGetPageNumer(int getPageNumer) {
        this.getPageNumer = getPageNumer;
    }

    public Sort.Direction getDirection() {
        return direction;
    }

    public void setDirection(Sort.Direction direction) {
        this.direction = direction;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
}
