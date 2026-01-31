package fr.spacefox.perftests.quarkus.data.entity151;

import fr.spacefox.perftests.quarkus.core.service151.model.Model151;

final class Mapper {
    private Mapper() {}

    public static Model151 of(Entity151 entity) {
        return new Model151(entity.getId(), entity.getField());
    }
}
