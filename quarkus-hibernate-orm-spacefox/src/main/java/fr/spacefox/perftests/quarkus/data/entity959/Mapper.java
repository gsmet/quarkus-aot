package fr.spacefox.perftests.quarkus.data.entity959;

import fr.spacefox.perftests.quarkus.core.service959.model.Model959;

final class Mapper {
    private Mapper() {}

    public static Model959 of(Entity959 entity) {
        return new Model959(entity.getId(), entity.getField());
    }
}
