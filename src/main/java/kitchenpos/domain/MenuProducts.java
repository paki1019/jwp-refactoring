package kitchenpos.domain;

import java.util.List;
import java.util.stream.Collectors;

public class MenuProducts {
    private final List<MenuProduct> menuProducts;

    public MenuProducts(List<MenuProduct> menuProducts) {
        this.menuProducts = menuProducts;
    }

    public List<Long> getProductIds() {
        return menuProducts.stream()
            .map(MenuProduct::getProductId)
            .collect(Collectors.toList());
    }

    public List<MenuProduct> getList() {
        return menuProducts;
    }
}