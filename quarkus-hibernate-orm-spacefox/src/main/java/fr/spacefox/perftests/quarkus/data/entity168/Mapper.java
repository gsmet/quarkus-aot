package fr.spacefox.perftests.quarkus.data.entity168;

import fr.spacefox.perftests.quarkus.core.service168.model.Model168;

final class Mapper {
    private Mapper() {}

    public static Model168 of(Entity168 entity) {
        return new Model168(entity.getId(), entity.getField());
    }
}
