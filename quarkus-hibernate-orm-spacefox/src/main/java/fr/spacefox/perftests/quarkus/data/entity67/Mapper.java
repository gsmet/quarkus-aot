package fr.spacefox.perftests.quarkus.data.entity67;

import fr.spacefox.perftests.quarkus.core.service67.model.Model67;

final class Mapper {
    private Mapper() {}

    public static Model67 of(Entity67 entity) {
        return new Model67(entity.getId(), entity.getField());
    }
}
