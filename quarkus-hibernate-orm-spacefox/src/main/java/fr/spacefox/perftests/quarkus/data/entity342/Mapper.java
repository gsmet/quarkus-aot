package fr.spacefox.perftests.quarkus.data.entity342;

import fr.spacefox.perftests.quarkus.core.service342.model.Model342;

final class Mapper {
    private Mapper() {}

    public static Model342 of(Entity342 entity) {
        return new Model342(entity.getId(), entity.getField());
    }
}
