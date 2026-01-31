package fr.spacefox.perftests.quarkus.data.entity968;

import fr.spacefox.perftests.quarkus.core.service968.model.Model968;

final class Mapper {
    private Mapper() {}

    public static Model968 of(Entity968 entity) {
        return new Model968(entity.getId(), entity.getField());
    }
}
