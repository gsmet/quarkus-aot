package fr.spacefox.perftests.quarkus.data.entity57;

import fr.spacefox.perftests.quarkus.core.service57.model.Model57;

final class Mapper {
    private Mapper() {}

    public static Model57 of(Entity57 entity) {
        return new Model57(entity.getId(), entity.getField());
    }
}
