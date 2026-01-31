package fr.spacefox.perftests.quarkus.data.entity815;

import fr.spacefox.perftests.quarkus.core.service815.model.Model815;

final class Mapper {
    private Mapper() {}

    public static Model815 of(Entity815 entity) {
        return new Model815(entity.getId(), entity.getField());
    }
}
