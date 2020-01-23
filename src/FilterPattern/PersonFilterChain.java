package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public final class PersonFilterChain implements FilterChain {
    private int position = 0;
    private List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    @Override
    public void doFilter(List<Person> list) {
        if (position < filters.size()) {
            Filter filter = filters.get(position);
            position++;
            filter.doFilter(list, this);
        }
    }
}
