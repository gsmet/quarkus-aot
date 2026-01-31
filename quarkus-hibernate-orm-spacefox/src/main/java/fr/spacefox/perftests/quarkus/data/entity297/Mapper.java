package fr.spacefox.perftests.quarkus.data.entity297;

import fr.spacefox.perftests.quarkus.core.service297.model.Model297;

final class Mapper {
    private Mapper() {}

    public static Model297 of(Entity297 entity) {
        return new Model297(entity.getId(), entity.getField());
    }
}
