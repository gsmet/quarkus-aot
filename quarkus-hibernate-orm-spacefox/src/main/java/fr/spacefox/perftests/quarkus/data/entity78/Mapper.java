package fr.spacefox.perftests.quarkus.data.entity78;

import fr.spacefox.perftests.quarkus.core.service78.model.Model78;

final class Mapper {
    private Mapper() {}

    public static Model78 of(Entity78 entity) {
        return new Model78(entity.getId(), entity.getField());
    }
}
