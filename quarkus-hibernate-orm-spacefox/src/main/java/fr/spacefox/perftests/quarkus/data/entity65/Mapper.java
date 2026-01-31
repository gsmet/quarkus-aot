package fr.spacefox.perftests.quarkus.data.entity65;

import fr.spacefox.perftests.quarkus.core.service65.model.Model65;

final class Mapper {
    private Mapper() {}

    public static Model65 of(Entity65 entity) {
        return new Model65(entity.getId(), entity.getField());
    }
}
