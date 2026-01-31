package fr.spacefox.perftests.quarkus.data.entity537;

import fr.spacefox.perftests.quarkus.core.service537.model.Model537;

final class Mapper {
    private Mapper() {}

    public static Model537 of(Entity537 entity) {
        return new Model537(entity.getId(), entity.getField());
    }
}
