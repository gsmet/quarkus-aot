package fr.spacefox.perftests.quarkus.data.entity336;

import fr.spacefox.perftests.quarkus.core.service336.model.Model336;

final class Mapper {
    private Mapper() {}

    public static Model336 of(Entity336 entity) {
        return new Model336(entity.getId(), entity.getField());
    }
}
