package fr.spacefox.perftests.quarkus.data.entity108;

import fr.spacefox.perftests.quarkus.core.service108.model.Model108;

final class Mapper {
    private Mapper() {}

    public static Model108 of(Entity108 entity) {
        return new Model108(entity.getId(), entity.getField());
    }
}
