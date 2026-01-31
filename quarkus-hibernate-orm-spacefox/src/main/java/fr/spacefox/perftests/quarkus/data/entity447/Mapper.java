package fr.spacefox.perftests.quarkus.data.entity447;

import fr.spacefox.perftests.quarkus.core.service447.model.Model447;

final class Mapper {
    private Mapper() {}

    public static Model447 of(Entity447 entity) {
        return new Model447(entity.getId(), entity.getField());
    }
}
