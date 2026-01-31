package fr.spacefox.perftests.quarkus.data.entity671;

import fr.spacefox.perftests.quarkus.core.service671.model.Model671;

final class Mapper {
    private Mapper() {}

    public static Model671 of(Entity671 entity) {
        return new Model671(entity.getId(), entity.getField());
    }
}
