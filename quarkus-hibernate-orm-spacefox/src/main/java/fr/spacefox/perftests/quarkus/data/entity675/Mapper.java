package fr.spacefox.perftests.quarkus.data.entity675;

import fr.spacefox.perftests.quarkus.core.service675.model.Model675;

final class Mapper {
    private Mapper() {}

    public static Model675 of(Entity675 entity) {
        return new Model675(entity.getId(), entity.getField());
    }
}
