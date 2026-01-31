package fr.spacefox.perftests.quarkus.data.entity649;

import fr.spacefox.perftests.quarkus.core.service649.model.Model649;

final class Mapper {
    private Mapper() {}

    public static Model649 of(Entity649 entity) {
        return new Model649(entity.getId(), entity.getField());
    }
}
