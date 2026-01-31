package fr.spacefox.perftests.quarkus.data.entity90;

import fr.spacefox.perftests.quarkus.core.service90.model.Model90;

final class Mapper {
    private Mapper() {}

    public static Model90 of(Entity90 entity) {
        return new Model90(entity.getId(), entity.getField());
    }
}
