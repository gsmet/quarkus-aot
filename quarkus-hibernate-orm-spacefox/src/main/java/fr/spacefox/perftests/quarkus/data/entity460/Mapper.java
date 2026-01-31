package fr.spacefox.perftests.quarkus.data.entity460;

import fr.spacefox.perftests.quarkus.core.service460.model.Model460;

final class Mapper {
    private Mapper() {}

    public static Model460 of(Entity460 entity) {
        return new Model460(entity.getId(), entity.getField());
    }
}
