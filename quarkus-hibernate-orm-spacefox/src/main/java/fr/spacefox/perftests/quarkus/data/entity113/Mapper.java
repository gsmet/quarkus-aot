package fr.spacefox.perftests.quarkus.data.entity113;

import fr.spacefox.perftests.quarkus.core.service113.model.Model113;

final class Mapper {
    private Mapper() {}

    public static Model113 of(Entity113 entity) {
        return new Model113(entity.getId(), entity.getField());
    }
}
