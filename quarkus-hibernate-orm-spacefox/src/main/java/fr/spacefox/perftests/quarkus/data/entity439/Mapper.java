package fr.spacefox.perftests.quarkus.data.entity439;

import fr.spacefox.perftests.quarkus.core.service439.model.Model439;

final class Mapper {
    private Mapper() {}

    public static Model439 of(Entity439 entity) {
        return new Model439(entity.getId(), entity.getField());
    }
}
