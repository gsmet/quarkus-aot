package fr.spacefox.perftests.quarkus.data.entity89;

import fr.spacefox.perftests.quarkus.core.service89.model.Model89;

final class Mapper {
    private Mapper() {}

    public static Model89 of(Entity89 entity) {
        return new Model89(entity.getId(), entity.getField());
    }
}
