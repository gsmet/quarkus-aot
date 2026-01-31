package fr.spacefox.perftests.quarkus.data.entity961;

import fr.spacefox.perftests.quarkus.core.service961.model.Model961;

final class Mapper {
    private Mapper() {}

    public static Model961 of(Entity961 entity) {
        return new Model961(entity.getId(), entity.getField());
    }
}
