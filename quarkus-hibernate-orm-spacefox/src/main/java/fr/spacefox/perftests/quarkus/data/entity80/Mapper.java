package fr.spacefox.perftests.quarkus.data.entity80;

import fr.spacefox.perftests.quarkus.core.service80.model.Model80;

final class Mapper {
    private Mapper() {}

    public static Model80 of(Entity80 entity) {
        return new Model80(entity.getId(), entity.getField());
    }
}
