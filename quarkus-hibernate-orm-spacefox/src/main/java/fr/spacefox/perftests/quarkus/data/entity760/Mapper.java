package fr.spacefox.perftests.quarkus.data.entity760;

import fr.spacefox.perftests.quarkus.core.service760.model.Model760;

final class Mapper {
    private Mapper() {}

    public static Model760 of(Entity760 entity) {
        return new Model760(entity.getId(), entity.getField());
    }
}
