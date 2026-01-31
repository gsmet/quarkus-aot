package fr.spacefox.perftests.quarkus.data.entity841;

import fr.spacefox.perftests.quarkus.core.service841.model.Model841;

final class Mapper {
    private Mapper() {}

    public static Model841 of(Entity841 entity) {
        return new Model841(entity.getId(), entity.getField());
    }
}
