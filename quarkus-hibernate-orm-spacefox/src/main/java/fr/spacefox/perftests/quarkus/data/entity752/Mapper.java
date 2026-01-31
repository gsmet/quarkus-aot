package fr.spacefox.perftests.quarkus.data.entity752;

import fr.spacefox.perftests.quarkus.core.service752.model.Model752;

final class Mapper {
    private Mapper() {}

    public static Model752 of(Entity752 entity) {
        return new Model752(entity.getId(), entity.getField());
    }
}
