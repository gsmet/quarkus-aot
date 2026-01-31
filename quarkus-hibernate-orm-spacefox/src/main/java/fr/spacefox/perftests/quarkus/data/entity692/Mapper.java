package fr.spacefox.perftests.quarkus.data.entity692;

import fr.spacefox.perftests.quarkus.core.service692.model.Model692;

final class Mapper {
    private Mapper() {}

    public static Model692 of(Entity692 entity) {
        return new Model692(entity.getId(), entity.getField());
    }
}
