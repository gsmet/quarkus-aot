package fr.spacefox.perftests.quarkus.data.entity240;

import fr.spacefox.perftests.quarkus.core.service240.model.Model240;

final class Mapper {
    private Mapper() {}

    public static Model240 of(Entity240 entity) {
        return new Model240(entity.getId(), entity.getField());
    }
}
