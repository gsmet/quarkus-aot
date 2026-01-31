package fr.spacefox.perftests.quarkus.data.entity559;

import fr.spacefox.perftests.quarkus.core.service559.model.Model559;

final class Mapper {
    private Mapper() {}

    public static Model559 of(Entity559 entity) {
        return new Model559(entity.getId(), entity.getField());
    }
}
