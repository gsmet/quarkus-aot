package fr.spacefox.perftests.quarkus.data.entity71;

import fr.spacefox.perftests.quarkus.core.service71.model.Model71;

final class Mapper {
    private Mapper() {}

    public static Model71 of(Entity71 entity) {
        return new Model71(entity.getId(), entity.getField());
    }
}
