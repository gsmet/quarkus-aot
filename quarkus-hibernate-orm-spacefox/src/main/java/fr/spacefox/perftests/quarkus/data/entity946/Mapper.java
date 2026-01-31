package fr.spacefox.perftests.quarkus.data.entity946;

import fr.spacefox.perftests.quarkus.core.service946.model.Model946;

final class Mapper {
    private Mapper() {}

    public static Model946 of(Entity946 entity) {
        return new Model946(entity.getId(), entity.getField());
    }
}
