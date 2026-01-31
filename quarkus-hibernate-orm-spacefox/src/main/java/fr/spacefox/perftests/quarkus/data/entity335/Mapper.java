package fr.spacefox.perftests.quarkus.data.entity335;

import fr.spacefox.perftests.quarkus.core.service335.model.Model335;

final class Mapper {
    private Mapper() {}

    public static Model335 of(Entity335 entity) {
        return new Model335(entity.getId(), entity.getField());
    }
}
