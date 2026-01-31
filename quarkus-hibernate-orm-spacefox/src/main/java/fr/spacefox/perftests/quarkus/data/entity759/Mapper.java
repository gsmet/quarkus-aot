package fr.spacefox.perftests.quarkus.data.entity759;

import fr.spacefox.perftests.quarkus.core.service759.model.Model759;

final class Mapper {
    private Mapper() {}

    public static Model759 of(Entity759 entity) {
        return new Model759(entity.getId(), entity.getField());
    }
}
