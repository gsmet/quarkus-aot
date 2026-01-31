package fr.spacefox.perftests.quarkus.data.entity295;

import fr.spacefox.perftests.quarkus.core.service295.model.Model295;

final class Mapper {
    private Mapper() {}

    public static Model295 of(Entity295 entity) {
        return new Model295(entity.getId(), entity.getField());
    }
}
