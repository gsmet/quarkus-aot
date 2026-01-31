package fr.spacefox.perftests.quarkus.data.entity234;

import fr.spacefox.perftests.quarkus.core.service234.model.Model234;

final class Mapper {
    private Mapper() {}

    public static Model234 of(Entity234 entity) {
        return new Model234(entity.getId(), entity.getField());
    }
}
