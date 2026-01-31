package fr.spacefox.perftests.quarkus.data.entity511;

import fr.spacefox.perftests.quarkus.core.service511.model.Model511;

final class Mapper {
    private Mapper() {}

    public static Model511 of(Entity511 entity) {
        return new Model511(entity.getId(), entity.getField());
    }
}
