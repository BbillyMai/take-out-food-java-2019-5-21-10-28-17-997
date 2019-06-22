import java.util.List;

public class ItemRepositoryTestImpl implements ItemRepository{
    @Override
    public List<Item> findAll() {
        return TestData.ALL_ITEMS;
    }

    @Override
    public Item findById(String id) {
        for(Item item: TestData.ALL_ITEMS){
            if(id.equals(item.getId())){
                return item;
            }
        }
        return null;
    }
}
