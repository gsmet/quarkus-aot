package fr.spacefox.perftests.quarkus.data.entity556;

import fr.spacefox.perftests.quarkus.core.service556.model.Model556;

final class Mapper {
    private Mapper() {}

    public static Model556 of(Entity556 entity) {
        return new Model556(entity.getId(), entity.getField());
    }
}
