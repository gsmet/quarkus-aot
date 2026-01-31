package fr.spacefox.perftests.quarkus.data.entity534;

import fr.spacefox.perftests.quarkus.core.service534.model.Model534;

final class Mapper {
    private Mapper() {}

    public static Model534 of(Entity534 entity) {
        return new Model534(entity.getId(), entity.getField());
    }
}
