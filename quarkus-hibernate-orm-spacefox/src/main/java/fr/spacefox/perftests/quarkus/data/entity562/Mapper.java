package fr.spacefox.perftests.quarkus.data.entity562;

import fr.spacefox.perftests.quarkus.core.service562.model.Model562;

final class Mapper {
    private Mapper() {}

    public static Model562 of(Entity562 entity) {
        return new Model562(entity.getId(), entity.getField());
    }
}
