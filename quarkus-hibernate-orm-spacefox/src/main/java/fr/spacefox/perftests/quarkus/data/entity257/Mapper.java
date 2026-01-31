package fr.spacefox.perftests.quarkus.data.entity257;

import fr.spacefox.perftests.quarkus.core.service257.model.Model257;

final class Mapper {
    private Mapper() {}

    public static Model257 of(Entity257 entity) {
        return new Model257(entity.getId(), entity.getField());
    }
}
