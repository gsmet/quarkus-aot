package fr.spacefox.perftests.quarkus.data.entity923;

import fr.spacefox.perftests.quarkus.core.service923.model.Model923;

final class Mapper {
    private Mapper() {}

    public static Model923 of(Entity923 entity) {
        return new Model923(entity.getId(), entity.getField());
    }
}
