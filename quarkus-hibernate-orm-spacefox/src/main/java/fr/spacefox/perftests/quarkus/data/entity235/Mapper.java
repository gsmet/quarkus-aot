package fr.spacefox.perftests.quarkus.data.entity235;

import fr.spacefox.perftests.quarkus.core.service235.model.Model235;

final class Mapper {
    private Mapper() {}

    public static Model235 of(Entity235 entity) {
        return new Model235(entity.getId(), entity.getField());
    }
}
