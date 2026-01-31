package fr.spacefox.perftests.quarkus.data.entity68;

import fr.spacefox.perftests.quarkus.core.service68.model.Model68;

final class Mapper {
    private Mapper() {}

    public static Model68 of(Entity68 entity) {
        return new Model68(entity.getId(), entity.getField());
    }
}
