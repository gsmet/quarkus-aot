package fr.spacefox.perftests.quarkus.data.entity93;

import fr.spacefox.perftests.quarkus.core.service93.model.Model93;

final class Mapper {
    private Mapper() {}

    public static Model93 of(Entity93 entity) {
        return new Model93(entity.getId(), entity.getField());
    }
}
