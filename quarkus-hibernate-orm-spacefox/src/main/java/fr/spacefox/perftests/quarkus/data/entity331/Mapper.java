package fr.spacefox.perftests.quarkus.data.entity331;

import fr.spacefox.perftests.quarkus.core.service331.model.Model331;

final class Mapper {
    private Mapper() {}

    public static Model331 of(Entity331 entity) {
        return new Model331(entity.getId(), entity.getField());
    }
}
