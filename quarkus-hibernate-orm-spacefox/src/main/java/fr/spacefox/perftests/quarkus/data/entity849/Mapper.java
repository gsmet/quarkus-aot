package fr.spacefox.perftests.quarkus.data.entity849;

import fr.spacefox.perftests.quarkus.core.service849.model.Model849;

final class Mapper {
    private Mapper() {}

    public static Model849 of(Entity849 entity) {
        return new Model849(entity.getId(), entity.getField());
    }
}
