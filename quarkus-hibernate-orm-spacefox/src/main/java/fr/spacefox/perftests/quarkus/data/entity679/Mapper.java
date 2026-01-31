package fr.spacefox.perftests.quarkus.data.entity679;

import fr.spacefox.perftests.quarkus.core.service679.model.Model679;

final class Mapper {
    private Mapper() {}

    public static Model679 of(Entity679 entity) {
        return new Model679(entity.getId(), entity.getField());
    }
}
