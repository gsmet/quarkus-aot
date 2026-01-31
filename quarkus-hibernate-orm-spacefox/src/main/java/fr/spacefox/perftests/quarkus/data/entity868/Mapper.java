package fr.spacefox.perftests.quarkus.data.entity868;

import fr.spacefox.perftests.quarkus.core.service868.model.Model868;

final class Mapper {
    private Mapper() {}

    public static Model868 of(Entity868 entity) {
        return new Model868(entity.getId(), entity.getField());
    }
}
