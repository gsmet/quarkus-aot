package fr.spacefox.perftests.quarkus.data.entity313;

import fr.spacefox.perftests.quarkus.core.service313.model.Model313;

final class Mapper {
    private Mapper() {}

    public static Model313 of(Entity313 entity) {
        return new Model313(entity.getId(), entity.getField());
    }
}
