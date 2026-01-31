package fr.spacefox.perftests.quarkus.data.entity794;

import fr.spacefox.perftests.quarkus.core.service794.model.Model794;

final class Mapper {
    private Mapper() {}

    public static Model794 of(Entity794 entity) {
        return new Model794(entity.getId(), entity.getField());
    }
}
