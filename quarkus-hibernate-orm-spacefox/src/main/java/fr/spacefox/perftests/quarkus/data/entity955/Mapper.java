package fr.spacefox.perftests.quarkus.data.entity955;

import fr.spacefox.perftests.quarkus.core.service955.model.Model955;

final class Mapper {
    private Mapper() {}

    public static Model955 of(Entity955 entity) {
        return new Model955(entity.getId(), entity.getField());
    }
}
