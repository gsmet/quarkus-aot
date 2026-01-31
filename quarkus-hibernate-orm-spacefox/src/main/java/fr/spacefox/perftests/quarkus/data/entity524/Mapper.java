package fr.spacefox.perftests.quarkus.data.entity524;

import fr.spacefox.perftests.quarkus.core.service524.model.Model524;

final class Mapper {
    private Mapper() {}

    public static Model524 of(Entity524 entity) {
        return new Model524(entity.getId(), entity.getField());
    }
}
