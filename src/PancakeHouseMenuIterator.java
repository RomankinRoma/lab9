import java.util.ArrayList;

public class PancakeHouseMenuIterator implements CustomIterator {
    ArrayList<MenuItem> list;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> list) {
        this.list = list;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public Boolean hasNext() {
        if (position >= list.size() || list.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (list.get(position-1) != null) {
            list.remove(position);
        }
    }
}
