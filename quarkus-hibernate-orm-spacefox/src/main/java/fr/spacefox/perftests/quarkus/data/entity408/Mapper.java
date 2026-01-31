package fr.spacefox.perftests.quarkus.data.entity408;

import fr.spacefox.perftests.quarkus.core.service408.model.Model408;

final class Mapper {
    private Mapper() {}

    public static Model408 of(Entity408 entity) {
        return new Model408(entity.getId(), entity.getField());
    }
}
