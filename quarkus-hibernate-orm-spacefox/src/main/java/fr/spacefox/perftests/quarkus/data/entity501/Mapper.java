package fr.spacefox.perftests.quarkus.data.entity501;

import fr.spacefox.perftests.quarkus.core.service501.model.Model501;

final class Mapper {
    private Mapper() {}

    public static Model501 of(Entity501 entity) {
        return new Model501(entity.getId(), entity.getField());
    }
}
