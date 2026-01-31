package fr.spacefox.perftests.quarkus.data.entity805;

import fr.spacefox.perftests.quarkus.core.service805.model.Model805;

final class Mapper {
    private Mapper() {}

    public static Model805 of(Entity805 entity) {
        return new Model805(entity.getId(), entity.getField());
    }
}
