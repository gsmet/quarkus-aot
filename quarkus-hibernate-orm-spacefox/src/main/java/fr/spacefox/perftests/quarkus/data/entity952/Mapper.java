package fr.spacefox.perftests.quarkus.data.entity952;

import fr.spacefox.perftests.quarkus.core.service952.model.Model952;

final class Mapper {
    private Mapper() {}

    public static Model952 of(Entity952 entity) {
        return new Model952(entity.getId(), entity.getField());
    }
}
