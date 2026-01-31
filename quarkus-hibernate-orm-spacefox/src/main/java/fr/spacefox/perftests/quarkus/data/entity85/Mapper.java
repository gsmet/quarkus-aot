package fr.spacefox.perftests.quarkus.data.entity85;

import fr.spacefox.perftests.quarkus.core.service85.model.Model85;

final class Mapper {
    private Mapper() {}

    public static Model85 of(Entity85 entity) {
        return new Model85(entity.getId(), entity.getField());
    }
}
