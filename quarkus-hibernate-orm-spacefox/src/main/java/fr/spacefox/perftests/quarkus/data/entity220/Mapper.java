package fr.spacefox.perftests.quarkus.data.entity220;

import fr.spacefox.perftests.quarkus.core.service220.model.Model220;

final class Mapper {
    private Mapper() {}

    public static Model220 of(Entity220 entity) {
        return new Model220(entity.getId(), entity.getField());
    }
}
