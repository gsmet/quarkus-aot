package fr.spacefox.perftests.quarkus.data.entity136;

import fr.spacefox.perftests.quarkus.core.service136.model.Model136;

final class Mapper {
    private Mapper() {}

    public static Model136 of(Entity136 entity) {
        return new Model136(entity.getId(), entity.getField());
    }
}
