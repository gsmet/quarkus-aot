package fr.spacefox.perftests.quarkus.data.entity477;

import fr.spacefox.perftests.quarkus.core.service477.model.Model477;

final class Mapper {
    private Mapper() {}

    public static Model477 of(Entity477 entity) {
        return new Model477(entity.getId(), entity.getField());
    }
}
