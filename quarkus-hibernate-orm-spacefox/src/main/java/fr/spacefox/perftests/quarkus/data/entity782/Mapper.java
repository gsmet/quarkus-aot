package fr.spacefox.perftests.quarkus.data.entity782;

import fr.spacefox.perftests.quarkus.core.service782.model.Model782;

final class Mapper {
    private Mapper() {}

    public static Model782 of(Entity782 entity) {
        return new Model782(entity.getId(), entity.getField());
    }
}
