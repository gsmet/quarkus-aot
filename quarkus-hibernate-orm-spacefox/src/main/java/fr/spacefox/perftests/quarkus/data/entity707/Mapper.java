package fr.spacefox.perftests.quarkus.data.entity707;

import fr.spacefox.perftests.quarkus.core.service707.model.Model707;

final class Mapper {
    private Mapper() {}

    public static Model707 of(Entity707 entity) {
        return new Model707(entity.getId(), entity.getField());
    }
}
