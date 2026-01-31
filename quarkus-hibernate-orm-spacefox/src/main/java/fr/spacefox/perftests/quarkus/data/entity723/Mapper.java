package fr.spacefox.perftests.quarkus.data.entity723;

import fr.spacefox.perftests.quarkus.core.service723.model.Model723;

final class Mapper {
    private Mapper() {}

    public static Model723 of(Entity723 entity) {
        return new Model723(entity.getId(), entity.getField());
    }
}
