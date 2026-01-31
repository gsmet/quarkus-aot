package fr.spacefox.perftests.quarkus.data.entity109;

import fr.spacefox.perftests.quarkus.core.service109.model.Model109;

final class Mapper {
    private Mapper() {}

    public static Model109 of(Entity109 entity) {
        return new Model109(entity.getId(), entity.getField());
    }
}
