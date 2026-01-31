package fr.spacefox.perftests.quarkus.data.entity261;

import fr.spacefox.perftests.quarkus.core.service261.model.Model261;

final class Mapper {
    private Mapper() {}

    public static Model261 of(Entity261 entity) {
        return new Model261(entity.getId(), entity.getField());
    }
}
