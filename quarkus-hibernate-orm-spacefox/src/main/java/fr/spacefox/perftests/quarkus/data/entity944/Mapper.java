package fr.spacefox.perftests.quarkus.data.entity944;

import fr.spacefox.perftests.quarkus.core.service944.model.Model944;

final class Mapper {
    private Mapper() {}

    public static Model944 of(Entity944 entity) {
        return new Model944(entity.getId(), entity.getField());
    }
}
