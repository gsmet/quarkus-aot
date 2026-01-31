package fr.spacefox.perftests.quarkus.data.entity987;

import fr.spacefox.perftests.quarkus.core.service987.model.Model987;

final class Mapper {
    private Mapper() {}

    public static Model987 of(Entity987 entity) {
        return new Model987(entity.getId(), entity.getField());
    }
}
