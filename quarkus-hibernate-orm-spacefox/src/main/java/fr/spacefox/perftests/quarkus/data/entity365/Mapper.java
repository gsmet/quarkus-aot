package fr.spacefox.perftests.quarkus.data.entity365;

import fr.spacefox.perftests.quarkus.core.service365.model.Model365;

final class Mapper {
    private Mapper() {}

    public static Model365 of(Entity365 entity) {
        return new Model365(entity.getId(), entity.getField());
    }
}
