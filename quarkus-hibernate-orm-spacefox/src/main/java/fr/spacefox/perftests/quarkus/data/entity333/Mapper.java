package fr.spacefox.perftests.quarkus.data.entity333;

import fr.spacefox.perftests.quarkus.core.service333.model.Model333;

final class Mapper {
    private Mapper() {}

    public static Model333 of(Entity333 entity) {
        return new Model333(entity.getId(), entity.getField());
    }
}
