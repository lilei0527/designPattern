package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public  class AbstractFilterChain<T> implements FilterChain<T> {
    private int position = 0;
    private List<Filter<T>> filters = new ArrayList<>();

    public void addFilter(Filter<T> filter) {
        filters.add(filter);
    }

    @Override
    public void doFilter(T t) {
        if (position < filters.size()) {
            Filter<T> filter = filters.get(position);
            position++;
            filter.doFilter(t, this);
        }
    }
}
