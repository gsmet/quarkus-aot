package fr.spacefox.perftests.quarkus.data.entity10;

import fr.spacefox.perftests.quarkus.core.service10.model.Model10;

final class Mapper {
    private Mapper() {}

    public static Model10 of(Entity10 entity) {
        return new Model10(entity.getId(), entity.getField());
    }
}
