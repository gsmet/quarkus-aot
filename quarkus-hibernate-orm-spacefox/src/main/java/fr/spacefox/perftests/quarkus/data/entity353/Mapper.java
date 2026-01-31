package fr.spacefox.perftests.quarkus.data.entity353;

import fr.spacefox.perftests.quarkus.core.service353.model.Model353;

final class Mapper {
    private Mapper() {}

    public static Model353 of(Entity353 entity) {
        return new Model353(entity.getId(), entity.getField());
    }
}
