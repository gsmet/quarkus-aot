package fr.spacefox.perftests.quarkus.data.entity352;

import fr.spacefox.perftests.quarkus.core.service352.model.Model352;

final class Mapper {
    private Mapper() {}

    public static Model352 of(Entity352 entity) {
        return new Model352(entity.getId(), entity.getField());
    }
}
