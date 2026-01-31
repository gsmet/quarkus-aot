package fr.spacefox.perftests.quarkus.data.entity910;

import fr.spacefox.perftests.quarkus.core.service910.model.Model910;

final class Mapper {
    private Mapper() {}

    public static Model910 of(Entity910 entity) {
        return new Model910(entity.getId(), entity.getField());
    }
}
