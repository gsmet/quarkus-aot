package fr.spacefox.perftests.quarkus.data.entity186;

import fr.spacefox.perftests.quarkus.core.service186.model.Model186;

final class Mapper {
    private Mapper() {}

    public static Model186 of(Entity186 entity) {
        return new Model186(entity.getId(), entity.getField());
    }
}
