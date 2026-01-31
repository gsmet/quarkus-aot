package fr.spacefox.perftests.quarkus.data.entity677;

import fr.spacefox.perftests.quarkus.core.service677.model.Model677;

final class Mapper {
    private Mapper() {}

    public static Model677 of(Entity677 entity) {
        return new Model677(entity.getId(), entity.getField());
    }
}
