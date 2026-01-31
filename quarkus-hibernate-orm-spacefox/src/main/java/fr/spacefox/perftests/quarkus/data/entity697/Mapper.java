package fr.spacefox.perftests.quarkus.data.entity697;

import fr.spacefox.perftests.quarkus.core.service697.model.Model697;

final class Mapper {
    private Mapper() {}

    public static Model697 of(Entity697 entity) {
        return new Model697(entity.getId(), entity.getField());
    }
}
