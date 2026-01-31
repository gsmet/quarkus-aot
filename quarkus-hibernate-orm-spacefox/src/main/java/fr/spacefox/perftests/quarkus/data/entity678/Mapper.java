package fr.spacefox.perftests.quarkus.data.entity678;

import fr.spacefox.perftests.quarkus.core.service678.model.Model678;

final class Mapper {
    private Mapper() {}

    public static Model678 of(Entity678 entity) {
        return new Model678(entity.getId(), entity.getField());
    }
}
