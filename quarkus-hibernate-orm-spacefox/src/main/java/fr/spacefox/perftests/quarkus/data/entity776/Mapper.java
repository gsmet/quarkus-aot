package fr.spacefox.perftests.quarkus.data.entity776;

import fr.spacefox.perftests.quarkus.core.service776.model.Model776;

final class Mapper {
    private Mapper() {}

    public static Model776 of(Entity776 entity) {
        return new Model776(entity.getId(), entity.getField());
    }
}
