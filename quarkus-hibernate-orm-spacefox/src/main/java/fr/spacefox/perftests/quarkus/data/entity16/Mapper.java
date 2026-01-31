package fr.spacefox.perftests.quarkus.data.entity16;

import fr.spacefox.perftests.quarkus.core.service16.model.Model16;

final class Mapper {
    private Mapper() {}

    public static Model16 of(Entity16 entity) {
        return new Model16(entity.getId(), entity.getField());
    }
}
