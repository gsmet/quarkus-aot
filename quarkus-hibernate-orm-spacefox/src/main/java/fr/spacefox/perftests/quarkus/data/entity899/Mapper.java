package fr.spacefox.perftests.quarkus.data.entity899;

import fr.spacefox.perftests.quarkus.core.service899.model.Model899;

final class Mapper {
    private Mapper() {}

    public static Model899 of(Entity899 entity) {
        return new Model899(entity.getId(), entity.getField());
    }
}
